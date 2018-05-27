# Basic notes for Go, part 2.

### Error handling

- Return variables:
Go functions can return error variables, which means that an error condition can be handled inside a function, outside of a function.

- Log and exit:
Generally speaking, log.Fatal() should be used instead of the os.Exit() function because it allows you to print an error message and exit your program using just one function call.

### Regular expresions.

- Check match or not
To check whether a word is in a sentence:

```
 match,_:=regexp.MatchString("Hi","Hi to all")
 ```

 - Check and replace

 ```
 parse,err:= regexp.Compile("[Mm]ar")
 if err != nil  {
	 fmt.Println("Error in RE",err)
 }else{
	 fmt.Println("-------")
	 fmt.Println(parse.MatchString("this is mar"))
	 fmt.Println(parse.MatchString("this is mAr"))
	 fmt.Println(parse.ReplaceAllString("this is mar","HELLO"))
 }

 ```

"parse.replaceAllString" replace the string that matches "[Mm]ar" by "HELLO"

- Split a string by space

```
 
 m[0]="a b c"
 data:=strings.Fields(m[4])
```

- strace  

It is used for debugging. It allows you to trace system calls and signals.
How to run:
```
$go build codeInGo.go
$strace ./codeInGo
```

- dtrace

It is used to see what happens behind the scenes on a system-wide basis
without the need to modify or recompile anything. It also allows you to work
on production systems and watch running programs or server processes
dynamically without introducing a big overhead.

Dtrace is more powerfull than trace. You can learn more about the dtrace(1) utility by reading DTrace: Dynamic Tracing in Oracle Solaris, Mac OS X, and FreeBSD by Brendan Gregg and Jim Mauro and by visiting http://dtrace.org/ .

- Unreachable code

For example for the code:

```
Package main

import "fmt"

func main(){

		fmt.Println(callF1())
}

func callF1() int{
		return 1
		fmt.Println("this is unreachable")
		return 2
}
```
To detect unreachable lines of code

```
$ go tool vet unreach.go 
unreach.go:12: unreachable code
```

- Tips to avoid common mistakes in Go

If you have an error in a Go function, either log it or return it; do not do both unless you have a really good reason to do so.

Go interfaces define behaviors, not data and data structures. Use the io.Reader and io.Writer interfaces because they make your code more extensible.

Make sure that you pass a pointer to a variable to a function only when needed. The rest of the time, just pass the value of the variable.

Error variables are not strings; they are error values.

If you are afraid of making mistakes, you will most likely end up doing nothing useful. So experiment as much as you can.


