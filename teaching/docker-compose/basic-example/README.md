# Basics of docker-compose

# How to run 

```
$ docker-compose up

```
From another terminal
```
$docker-compose ps
```

# How to test

Connect to one host by:
```
$docker ps
$docker exec -it CONTAINER_ID /bin/sh

```

# How to get the IP address of a container

```
$docker ps
$docker inspect CONTAINER_ID  | grep IPADDR
```
