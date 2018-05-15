package main

import (
	   "fmt"
       "os"
)

func main(){
	if len(os.Args) !=2 {
		os.Exit(1)
	}
	fmt.Println("Args 1 =", os.Args[1])

}
