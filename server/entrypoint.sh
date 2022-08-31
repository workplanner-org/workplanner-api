#!/bin/bash
echo "building the app..."
echo $PWD
# building the app

if ./gradlew build ; then 
    echo "!!!App built successfully!!!"
    # running the app
    echo "running the app..."
    ./gradlew bootRun
else 
    echo "... Build Failed ..."
fi