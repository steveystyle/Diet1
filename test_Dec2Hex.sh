#! /bin/bash

sudo javac Dec2Hex.java

echo "No input Test"

java Dec2Hex

echo "Not an integer Test"

java Dec2Hex 'blah'

echo "Negative integer test"

java Dec2Hex -1

echo "0 input test"

java Dec2Hex 0

ech0 "acceptable input test"

java Dec2Hex 15
