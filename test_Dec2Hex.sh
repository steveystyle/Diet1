#! /bin/bash

echo -ne "\nTest - no argument supplied - Error expected"

java Dec2Hex

echo -ne "\nTest - non integer 'blah' supllied as argument - Error expected"

java Dec2Hex 'blah'

echo -ne "\nTest - negative integer -1 supplied as argument - Error expected"

java Dec2Hex -1

echo -ne "\nTest - 0 supplied as argument - Error expected"

java Dec2Hex 0

echo -ne "\nTest - decimal 1.5 supplied as argument - Error expected"

java Dec2Hex 1.5

echo -ne "\nTest - negative decimal -1.5 supplied as argument - Error expected"

java Dec2Hex -1.5

echo -ne "\nTest - acceptable input 15 supplied as argument - Output expected 'F'"

java Dec2Hex 15
