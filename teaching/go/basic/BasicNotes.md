# Basics of Go programming

### How to compile, and execute

- Entry point is the  main() of any file .go

- Simple compilation and execution
```
go run goFile.go
```

- To see the temporal file
```
go run --work goFile.go
```

- To only compile and generate the binaries
```
go build goFile.go
ls -ltr
./goFile
```

- ONLY import the packages that your code will use.

- Go executable files are big, due to they are statically build, which means that does no require external libraries.

- To reduce a bit the size of the executable:
```
 $strip goFile:w
```

- Env variables:
```
$go help environment
$go env NAME_PATH
```

###  Entry point

- The "main" function, otherwise the following error will appear
```
command-line-arguments
runtime.main_main·f: relocation target main.main not defined
runtime.main_main·f: undefined: "main.main"
```


### Variables

- Default values: int =0, boolean=false, string=""

- Short version to infer the value:  variable := value
```
  g := "jaja" // declare and  assign a value
  g= "replace" //  do not declare again,only assign new value

  a:=10
  a,p:="hi",99 // As long as one variable  is new, := can be used
```

- Go DO NOT compile if there is an unused variable.

### Functions

- Functions can return multiple values
```
func add(x int, y int) int {}
func add(x,y  int) int {} // Another notation 
func addAndSubtraction (x int, y int) (int,int) {}
func addAndSubtraction (x , y int) (min, max int) {
    ...
	return a,b
	}
```
- Any value  is represented by "_"
```
sum, diff := addAndSubtraction(2,3)
_, diff := addAndSubtraction(2,3)  // sum is discarted
```
- Mosts of the functions return an error variable, which must be examinated.
  For example
```
  temp,_:=strconv.Atoi(args[i])  // The "_" is variable for the error 
```

- Anonymous  functions:
```
   myVariable:= func(s int) int{
	   return 2
   }
```

### Get input

- Packages: fmt, bufio

```
  var answer string
  fmt.Scanln(&answer) // Go passes variables by value, requires pointers
  fmt.Printf(" you typed %d \n", answer)
```

