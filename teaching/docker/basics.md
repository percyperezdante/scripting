#Docker

## Basic manipulation


```bash
 docker image ls
 docker container ls

 docker image rm ID
 docker container rm ID

 docker build -q -f DockerFilePath -t TagName .
 docker run -it --user `id -u` -v /host/path_share:/tmp/shared IMAGE_ID
 docker run -it --user `id -u` -v /host/path_share:/tmp/shared IMAGE_ID /bin/bash

```


## Pending 

- How to read from a File environment variables?
-

# Docker inspect format

Docker inspect is to observe the internals of a image. 

```bash
$docker inspect CONTAINER_ID 
$ docker inspect --format "hello {{.Id}} {{.Parent.User}}" CONTAINER_ID

```

- "{{}}"  refers to the Json format to call a key.
- "." refers to the context 

You can try to follow the exercises at:
https://container-solutions.com/docker-inspect-template-magic/



