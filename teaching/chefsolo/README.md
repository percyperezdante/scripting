# Chef my own laptop

This is an example to provision my own laptop.

# How to set up 

1. Create a box with minimal SO, using VM or Vagrant or Docker
2. ssh to the box
3. Copy or clone this repo 
4. Install chef-solo by running install_chef_solo.sh


# How to run it

Ssh to the box and run as following
```
$sudo chef-solo -c solo.rb -j solo.json
```


This will provision the example-setup recipies, which will install ntp and create
a directory for mounting.

```
package 'ntp'

directory '/mnt/myusb'

```


