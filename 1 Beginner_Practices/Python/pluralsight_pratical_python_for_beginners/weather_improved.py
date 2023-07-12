import requests

def get_weather_desc_and_temp():
    api_key = "846838313b02bb1afe8709d494ec68c9"
    city = "Curitiba"
    url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+api_key+"&units=metric"

    request = requests.get(url)
    json = request.json()

    description = json.get("weather")[0].get("description")
    temp_min = json.get("main").get("temp_min")
    temp_max = json.get("main").get("temp_max")

    return{'description': description,
        'temp_min': temp_min,
        'temp_max': temp_max}

def main():

    weather_dict = get_weather_desc_and_temp()
    print("Today's forecast is", weather_dict.get('description'))
    print("The minimum temperature is", weather_dict.get('temp_min'))
    print("The minimum temperature is", weather_dict.get('temp_max'))

main()