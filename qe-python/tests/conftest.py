import pytest
import requests
from bs4 import BeautifulSoup

@pytest.fixture
def input_value():
    return 12

@pytest.fixture
def home_page_content():
    res=requests.get("https://training-support.net")
    content=res.content
    soup=BeautifulSoup(content,"html.parser")
    return soup

@pytest.fixture
def test_list():
     return [1,2,3,4,5,6,7,8,9,10]


@pytest.fixture
def wallet():
    return {"amount": 0}