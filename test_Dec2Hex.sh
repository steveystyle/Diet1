#! /bin/bash

echo "Test - no argument supplied - Error expected"

java Dec2Hex

echo "Test - non integer 'blah' supllied as argument - Error expected"

java Dec2Hex 'blah'

echo "Test - negative integer -1 supplied as argument - Error expected"

java Dec2Hex -1

echo "Test - 0 supplied as argument - Error expected"

java Dec2Hex 0

echo "acceptable input 15 test - Output expected 'F'"

java Dec2Hex 15
