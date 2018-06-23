# Restful with Jersey and Grizzly

# General logic
The "BasicCRUDRest" is a basic example of how to get, put, delete and post to a webservice using Jersey over Grizzly.

# How to compile and run

To compile
```console
gradle superJar
```

To run
```console
percy@xps:BasicCRUDRest$ java -jar build/libs/BasicCRUDRest.super-0.1.1.jar 
Start
Jun 23, 2018 8:59:31 PM org.glassfish.grizzly.http.server.NetworkListener start
INFO: Started listener bound to [localhost:9998]
Jun 23, 2018 8:59:31 PM org.glassfish.grizzly.http.server.HttpServer start
INFO: [HttpServer] Started.
 Press ENTER to stop 
 ```

# How to test

```console
percy@xps:BasicCRUDRest$ curl localhost:9998/res -X PUT

101
percy@xps:BasicCRUDRest$ curl localhost:9998/res -X GET

101percy@xps:BasicCRUDRest$ curl localhost:9998/res -X DELETE

100percy@xps:BasicCRUDRest$ curl localhost:9998/res -X DELETE

99percy@xps:BasicCRUDRest$ curl localhost:9998/res -X POST -d "value=5555"

5555percy@xps:BasicCRUDRest$ curl localhost:9998/res -X GET

5555percy@xps:BasicCRUDRest$ curl localhost:9998/res -X DELETE

5554percy@xps:BasicCRUDRest$ curl localhost:9998/res/sp -X POST -d "value=5555"

Compelted 5555percy@xps:BasicCRUDRest$ 
```

#  References

- https://www.mkyong.com/webservices/jax-rs/jax-rs-formparam-example/
- https://javaee.github.io/grizzly/quickstart.html
- https://jersey.github.io/documentation/latest/index.html

