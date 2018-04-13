#!/bin/bash	


# List of colors
# Reference
# https://wiki.archlinux.org/index.php/Color_Bash_Prompt

NONE='\033[00m'
RED='\033[01;31m'
GREEN='\033[01;32m'
YELLOW='\033[01;33m'
BLUE='\033[01;34m'
PURPLE='\033[01;35m'
CYAN='\033[01;36m'
WHITE='\033[01;37m'

BOLD='\033[1m'
UNDERLINE='\033[4m'
BLINKING='\033[5m' # This does not work, for some reason ?
UNKNOWN='\033[6m' #  TODO: check what this code does..
INVERTED='\033[7m'


echo "Changing colors"
echo -e "1.- This $RED is red, and $GREEN this is green"
echo -e "1.- This $PURPLE is purple, and $CYAN is cyan"
echo -e "1.- This $WHITE is white and this is $BLUE BLUE"
echo -e "1.- $NONE This not BOLD  $BOLD is BOLD"
echo -e "1.- $NONE This not UNDERLINE $UNDERLINE is UNDERLINE"
echo -e "1.- $NONE This $WHITE is white"
echo -e "1.- $NONE This $BLINKING BLINKING"
echo -e "1.- $RED This $INVERTED INVERTED"



