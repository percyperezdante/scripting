FROM centos:centos7
MAINTAINER Percy Perez  

# ENV
# This sets one single environment variable in the container.
ENV MAIN_FORLDER /tmp/myapp
ENV REF /tmp/ref
ENV SRC /tmp/src
# This reuses ENVs created previously.
ENV LOG $MAIN_FORLDER/log

# Execute the shell command at BUILDING time.
# Not running time.
RUN ls -ltr
RUN pwd
RUN yum install -y python

# Copy and executes a shell script form host node to the container
COPY test.sh /tmp/test.sh
RUN bash /tmp/test.sh > $SRC

# Create new Volumes in the container
VOLUME /tmp/repo /tmp/p

# This expose the port 6666 but it does not publish it.
# You need to use -p HOST_PORT:6666 at running time with docker.
EXPOSE  6666

# Copy test.sh into /data/tmp
WORKDIR /data
COPY test.sh tmp/

# Copy test.sh into /repo/tmp
WORKDIR /repo
COPY test.sh tmp/

# Docker build  executes only RUN 
# Docker run    executes only CMD , but only will execute the LAST one.
#               CMD sets the default command at running time
#               if /bin/bash or entrypoint is defined, then CMD is ignored.
RUN echo "RUN  hiiiiiiiiiiiii "$SRC 
#CMD echo "CMD1 hiiiiiiiiiiiii "$SRC 
#CMD echo "CMD2 hiiiiiiiiiiiii "$SRC
#CMD echo "CMD3 hiiiiiiiiiiiii "$SRC

# Docker run      executes entrypoint, even the docker command has parameters
#                 It also stops to execute CMD at running time
#ENTRYPOINT echo "ENTRY POINT 1 jjjjjjj "$SRC

####
#  DOCKER ARE RUNNING TIME
#
### Access from outside
###### 
###### It requires to expose the port by using EXPOSE in Dockerfile
###### AND publish the port by mapping at runing time HOST_PORT:EXPOSED_PORT_CONTAINER
#
# docker run -it -p 7777:6666 IMAGE
#
# Then you can access from outside by https://localhost:7777

