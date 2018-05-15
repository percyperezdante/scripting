package main 

import (
	"fmt"
	"os"
	"strings"
)

func main(){
	args:=os.Args
	isKey:=false
	for i:=1;i<len(args);i++{
		if strings.Compare(args[i],"-i") == 0{
			isKey=true
			break
		}
	}
	if isKey{
		fmt.Println("Confirm y/n")
		var ans string
		fmt.Scanln(&ans)  // Go passes variables by value, requires pointers.
		fmt.Printf(" you typed %s \n ",ans)
	}else{

		fmt.Println("No key typed")
	}
}
