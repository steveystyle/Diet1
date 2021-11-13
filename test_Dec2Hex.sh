#! /bin/bash

echo -ne "\n\nTest - no argument supplied - Error expected\n"

java Dec2Hex

echo -ne "\n\nTest - non integer 'blah' supllied as argument - Error expected\n"

java Dec2Hex 'blah'

echo -ne "\n\nTest - negative integer -1 supplied as argument - Error expected\n"

java Dec2Hex -1

echo -ne "\n\nTest - 0 supplied as argument - Error expected\n"

java Dec2Hex 0

echo -ne "\n\nTest - decimal 1.5 supplied as argument - Error expected\n"

java Dec2Hex 1.5

echo -ne "\n\nTest - negative decimal -1.5 supplied as argument - Error expected\n"

java Dec2Hex -1.5

echo -ne "\n\nTest - acceptable input 15 supplied as argument - Output expected 'F'\n"

java Dec2Hex 15
