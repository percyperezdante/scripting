#!/usr/bin/env python

def f1(value):
    print("this fucntion "+value)

def f2(v1, v2, v3="aa"):  # v3 has default values = aa
    print(v1+ ","  + v2 + "," + v3)

f1("hi")
f2("1","b2")
