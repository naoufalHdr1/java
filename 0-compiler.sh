#!/bin/bash

# Check if the file exists
if [ -z "$1" ]; then
  echo "Usage: $0 <JavaFile.java>"
  exit 1
fi

# Extract file name without extension
filename=$(basename -- "$1")
filename_noext="${filename%.*}"

# Compile the Java file
javac "$1"

# Check if the compilation was successful
if [ $? -eq 0 ]; then
  java "$filename_noext"
  
  # Remove the compiled .class file
  rm -f "$filename_noext.class"
else
  echo "Compilation failed"
  exit 2
fi
