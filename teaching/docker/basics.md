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

