import requests

api_key = "846838313b02bb1afe8709d494ec68c9"
city = "Curitiba"
url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+api_key+"&units=metric"

request = requests.get(url)
json = request.json()
print(json)

description = json.get("weather")[0].get("description")
print("Today´s forecast is", description)
temp_min = json.get("main").get("temp_min")
print("The minimum temperature is", temp_min)
temp_max = json.get("main").get("temp_max")
print("The minimum temperature is", temp_max)
