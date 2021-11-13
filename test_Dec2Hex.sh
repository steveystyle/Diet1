#! /bin/bash

echo "Test - no argument supplied - Error expected"
echo
java Dec2Hex

echo "Test - non integer 'blah' supllied as argument - Error expected"
echo
java Dec2Hex 'blah'

echo "Test - negative integer -1 supplied as argument - Error expected"
echo
java Dec2Hex -1

echo "Test - 0 supplied as argument - Error expected"
echo
java Dec2Hex 0

echo "Test - decimal 1.5 supplied as argument - Error expected"
echo
java Dec2Hex 1.5

echo "Test - negative decimal -1.5 supplied as argument - Error expected"
echo
java Dec2Hex -1.5

echo "acceptable input 15 test - Output expected 'F'"
echo
java Dec2Hex 15
