#!/bin/bash

# -------------------------------
# Example of a progres bar 1
# -------------------------------
drawBar(){
	BAR=""
	CHAR="*"
	displaySpeed=$2
	lenght=$1
	for i in `seq 1 $lenght`; do
		BAR=$BAR""$CHAR
		echo -ne "\r${BAR:0:$i}" # print $i chars of $BAR from 0 position until $i
		sleep $displaySpeed
		echo -ne "\b"
	done
}


barLength=10
speed=.5
drawBar $barLength $speed
# Your program starts from here
# Do something in here


# -------------------------------
# Example of a progres bar 2
# -------------------------------
# 
ROTATE=1
startSpin() {
	local -a marks=( '/' '-' '\' '|' );
	while [[ $ROTATE ]]; do
		echo -ne "${marks[i++ % ${#marks[@]}]}";  #Do you like to know how this work?
		sleep .1;
		echo -ne "\b";
	done;
}

stopSpin(){
	nameThisScript=`echo $0 | cut -d\/ -f2`
	pkill $nameThisScript
}

startSpin &

#  Start your code
sleep 3
#  Stop your code

stopSpin

