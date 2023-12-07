#!/bin/bash

git pull
read NAME
kotlinc ./kotlin/$NAME.kt -include-runtime -d $NAME.jar
java -jar $NAME.jar
