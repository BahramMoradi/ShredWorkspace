# -*- coding: utf-8 -*-

import requests

url=r'https://api.linkedin.com/v1/companies/1337/updates?start=20&count=10&format=json'
resp=requests.get(url)

print resp.content
