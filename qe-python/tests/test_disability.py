import pytest

def testdiv2(input_value):
    assert input_value%2==0

def testdiv3(input_value):
    assert input_value%3==0

def test_page_title(home_page_content):
    heading=home_page_content.find("h1")
    assert heading.text=="Training Support"