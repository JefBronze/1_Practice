import requests
import json

def get_eia_data():
    url = "https://api.eia.gov/v2/petroleum/pri/dfp1/data/?api_key=&frequency=monthly&data[0]=value&start=1974-01&end=2023-03&sort[0][column]=period&sort[0][direction]=desc&offset=0&length=5000"

    response = requests.get(url)

    if response.status_code == 200:
        data = response.json()
        return data
    else:
        return None

data = get_eia_data()
if data is not None:
    print(json.dumps(data, indent=4))
else:
    print("Failed to fetch data")
