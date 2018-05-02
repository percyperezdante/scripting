#!/bin/bash

# This script reverse a integer number by
# 1 getting the module of 10
# 2 if the division to 10 is not 0, then x10 the result of(1)
#                                   Goto (1) with the result of the module
# 3 else the division is 0, sum previous values.

# For example:
# ---------------------------------------------------
# a=578
# a%10=8
# a/10=57 >0, then a becomes 8x10=80

# b=57%10=7
# 57/10=5 >0, then a becomes 80x10=800, and b=7x10=70

# 5%10=5
# 5/10=0 ==0, stop

#  The inverse of a is 800+70+5=875
# ---------------------------------------------------


NUM=$1
number=$NUM
inv=""

while [ $number -gt 0 ]
do
	module=`expr $number % 10`
	number=`expr $number / 10`
	inv=$inv`echo -e $module"\c"`
done
echo "Inverse of "$NUM" is "$nu$inv
