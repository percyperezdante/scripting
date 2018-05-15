package main

import "fmt"

func main(){

	var power int =999
	fmt.Printf(" num = %d \n", power)

	//short version
	po:= getValue()
	fmt.Printf(" short value  %d\n",po)

	// Alternative
	alternative()
}

func getValue() int {
	return 9
}

func alternative(){

	p:=10
	n,p := "hi",1000
	fmt.Printf(" two values %d    %s\n",p,n)
}
