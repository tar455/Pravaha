#!/bin/bash

# Define the Java file name (without .java extension)

JAVA_FILE_NAME="bin/PravahaMain"

javac $JAVA_FILE_NAME.java

if [ $? -eq 0 ]; then
    echo "Compilation Successful"
    java $JAVA_FILE
else
    echo "Compilation Failed"
fi