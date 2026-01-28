import math

num1=20
num2=10

def sum(num1,num2):
    return num1+num2

def test_sum():
    assert sum(num1,num2)==30

def diff(num1,num2):
    return num1-num2

def test_diff():
    assert diff(num1,num2)==30

def prod(num1,num2):
    return num1*num2

def test_prod():
    assert prod(num1,num2)==30

def quo(num1,num2):
    return num1/num2

def test_quo():
    assert quo(num1,num2)==2