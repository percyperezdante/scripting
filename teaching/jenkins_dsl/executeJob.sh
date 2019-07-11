#!/bin/bash

java -jar ./jenkins_cli/jenkins-cli.jar -s http://localhost:8080  build -v -f $1
