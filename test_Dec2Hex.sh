#! /bin/bash

echo "\nTest - no argument supplied - Error expected"

java Dec2Hex

echo "\nTest - non integer 'blah' supllied as argument - Error expected"

java Dec2Hex 'blah'

echo "\nTest - negative integer -1 supplied as argument - Error expected"

java Dec2Hex -1

echo "\nTest - 0 supplied as argument - Error expected"

java Dec2Hex 0

echo "\nTest - decimal 1.5 supplied as argument - Error expected"

java Dec2Hex 1.5

echo "\nTest - negative decimal -1.5 supplied as argument - Error expected"

java Dec2Hex -1.5

echo "\nacceptable input 15 test - Output expected 'F'"

java Dec2Hex 15
