package main

import (
    "fmt"
    "strconv"
)

func main(){
    var typedNumber string
    fmt.Printf("Enter a float number and press Enter: ")
    fmt.Scan(&typedNumber)
    userNumber, _ := strconv.ParseFloat(typedNumber,64)
    fmt.Printf("Truncated number: %.0f\n",userNumber)
}
