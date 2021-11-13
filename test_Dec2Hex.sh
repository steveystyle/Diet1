#! /bin/bash

echo -ne "\nTest - no argument supplied - Error expected\n"

java Dec2Hex

echo -ne "\nTest - non integer 'blah' supllied as argument - Error expected\n"

java Dec2Hex 'blah'

echo -ne "\nTest - negative integer -1 supplied as argument - Error expected\n"

java Dec2Hex -1

echo -ne "\nTest - 0 supplied as argument - Error expected\n"

java Dec2Hex 0

echo -ne "\nTest - decimal 1.5 supplied as argument - Error expected\n"

java Dec2Hex 1.5

echo -ne "\nTest - negative decimal -1.5 supplied as argument - Error expected\n"

java Dec2Hex -1.5

echo -ne "\nacceptable input 15 test - Output expected 'F'\n"

java Dec2Hex 15
