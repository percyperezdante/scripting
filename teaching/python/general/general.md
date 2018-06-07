# General notes 

### Dictionaries
- It is a collection of key value pairs.
  Each key is connected to a value
  The key allow access to the value
  Dictionaries are dynamic structures

- Adding and deleting  elements to a dictionary

```
>>> d={'a':1}
>>> d
{'a': 1}
>>> d['b']='d'
>>> d
{'a': 1, 'b': 'd'}
>>> del d['a']
>>> d
{'b': 'd'}

```

-  Loop for a dictionary
```
>>> for k,v in d.items(): # items() returns a list of key-value pairs
...     print k,v
... 
a 1
b d
```

- Loop for a dictionary based on keys
```
>>> for k in d.keys(): # keys() return the list of keys
...     print k
... 
a
b
>>> for k in d:  # the default behaviour is .keys()
...     print k
... 
a
b
```

- Sort a list in a loop

```
>>> for k in sorted(d.keys()):
...     print k
... 
a
b
```

- Listing the values of a dictionary
```
>>> for k in d.values():
...      print k
... 
1
d
>>> d
{'a': 1, 'b': 'd'}

```

- Set a list: remove duplicates

```
>>> d
{'a': 1, 'c': 'd', 'b': 'd'}
>>> for v in set(d.values()):
...      print v
... 
1
d
```

- Do not nested dictionaries more than 2 levels.


### Loops

- Getting input
```
#!/usr/bin/env python3


import sys
print(sys.version_info) # gets the python version

message="Type your name"
typed=input(message)
print("---"+ typed)

number=input("Type a number")
number=int(number)+1
print("Add one to typed number "+str(number))

```

- While loop
```
current_number=1
while current_number <= 5:
	print(current_number)
	current_number += 1
```

- Using Break

```
prompt= "Type something"
while True:
	city = input(prompt)
	if city == 'quit':
		break
		else:
			print("I'd love to go to " + city.title() + "!")

```

-  Using Continue

```
current_number = 0
while current_number < 10:
	u
	current_number += 1
	if current_number % 2 == 0:
		continue
		print(current_number)

```

- Loops with list and dictionaries

A for loop is effective for looping through a list, but you shouldn’t modify
a list inside a for loop because Python will have trouble keeping track of the
items in the list. To modify a list as you work through it, use a while loop.
Using while loops with lists and dictionaries allows you to collect, store, and
organize lots of input to examine and report on later.

- Get from a list

```
value=listVariable.pop()
```

- Append to a list
```
listVariable.append("hi")
```


- Removing from a lists

```
pets = ['dog', 'cat', 'dog', 'goldfish', 'cat', 'rabbit', 'cat']
print(pets)
while 'cat' in pets:
	pets.remove('cat')
	print(pets)

	```
- Filling a dictionary

```
polling_active = True
while polling_active:
# Prompt for the person's name and response.
	name = input("\nWhat is your name? ")
	response = input("Which mountain would you like to climb someday? ")
# Store the response in the dictionary:
	responses[name] = response
	repeat=input("do you like repeat")
	if repeat = "no":
		polling_active =false
```


