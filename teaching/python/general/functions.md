# Functions notes

### Arguments of a function

- Positional arguments

Means that each argument should be pass to the function in the correct order.

```
def function1(arg1, arg2):
	print(arg1)

function1("a","b")   # a is for arg1, and b is for arg2
```

- Keywords  arguments

Helps in readability

```
def function1(arg1, arg2):
	print(arg1)

function1(arg1="a",arg2="b")   # clearly says: a is for arg1, and b is for arg2
```

- Default values
Good practice is to locate the arguments with default values at the end.  Default values are used to return optional arguments
```
def f2(v1, v2, v3="aa"):  # v3 has default values = aa
    print(v1+ ","  + v2 + "," + v3)

f2("1","b2")  # v3 is not included, so it takes default value = aa
```

- Returning optional arguments

```
def get_formatted_name(first_name, last_name, middle_name=''):
"""Return a full name, neatly formatted."""

	if middle_name:  # NON EMPTY string  = true
		full_name = first_name + ' ' + middle_name + ' ' + last_name

	else:
		full_name = first_name + ' ' + last_name
	return full_name.title()

musician = get_formatted_name('jimi', 'hendrix')
print(musician)

musician = get_formatted_name('john', 'hooker', 'lee')
print(musician)
		```

- To pass a copy of a list
The [:]  slice notation makes a copy of the list.
```
print_models(unprinted_designs[:], completed_models)
```

- Passing random number of arguments

```
def make_pizza(*toppings):
	"""Print the list of toppings that have been requested."""
	print(toppings)

make_pizza('pepperoni')
make_pizza('mushrooms', 'green peppers', 'extra cheese')
```
The * creates a tuple called toppings and stores whatever values it receives into this tuple.

- Mixing positionand, keyword and arbitrary arguments
The parameter that accepts an arbitrary number of arguments must be placed
last in the function definition. Python matches positional and keyword
arguments first and then collects any remaining arguments in the final
parameter.

```
def make_pizza(size, *toppings):
	"""Summarize the pizza we are about to make."""
	print("\nMaking a " + str(size) + "-inch pizza with the following toppings:")

	for topping in toppings:
		print("- " + topping)

make_pizza(16, 'pepperoni')
make_pizza(12, 'mushrooms', 'green peppers', 'extra cheese')
```

- Using arbitraty keywords arguments

The double asterisks before the parameter **user_info cause Python to create
an empty dictionary called user_info and pack whatever name-value pairs it
receives into this dictionary. Within the function, you can access the name-
value pairs in user_info just as you would for any dictionary.

```
def build_profile(first, last, **user_info):
	"""Build a dictionary containing everything we know about a user."""
	profile = {}
	profile['first_name'] = first
	profile['last_name'] = last
	for key, value in user_info.items():
		profile[key] = value
		return profile

user_profile = build_profile('albert', 'einstein', location='princeton', field='physics')
print(user_profile)
```
### Modules

- Importing all modules

```
import namePythonFile  # this will import all functions available in this file.py
import module1 as  m # Then you use m.<function name> to instead of module1

```

- Importing specific functions

Import the specific functions separated by comma.
In this you do not type the module name, you directly type the functions name

```
from namePythonFile import functionName1, namePythonFile.functionName2
from module1 import function1  as myF1 # then you use myF1 instead

```

- Importing all function of  module
This is not recommended as it load all functions and can lead to unexpected results.
```
from module import *  # you do not need use the dot notation to call functions`
```


