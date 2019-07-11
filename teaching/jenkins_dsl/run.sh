#!/bin/bash


PATH_JOB=$1

# The following requires a Jenkins runing at localhost:8080
./gradlew createPushDsl -DbaseUrl=http://localhost:8080 -Dpattern=$PATH_JOB
