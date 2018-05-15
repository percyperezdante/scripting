package main

import (
	"fmt"
	"os"
	"strconv"
)

func main(){
	args:=os.Args
	sum:=0
	aggrArgs:=""
	for i:=1;i<len(args);i++{
		aggrArgs=aggrArgs+" + "+args[i]
		temp,_:=strconv.Atoi(args[i]) // the _ corresponds to the error from the function
		sum=sum+temp
	}
	fmt.Printf(" The total sum of %s is %d\n",aggrArgs, sum)
}
