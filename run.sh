#!/bin/bash

kotlinc ./kotlin/main.kt -include-runtime -d main.jar
java -jar main.jar
