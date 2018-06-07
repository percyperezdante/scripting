#!/usr/bin/env python3


import sys
print(sys.version_info) # gets the python version

message="Type your name"
typed=input(message)
print("---"+ typed)

number=input("Type a number")
number=int(number)+1
print("Add one to typed number "+str(number))

