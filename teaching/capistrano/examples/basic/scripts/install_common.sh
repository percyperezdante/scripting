#!/bin/bash

apt-get update
apt-get -y install openssh-server


# set up SSH user to deploy
mkdir /home/deploy
mkdir /home/deploy/.ssh
useradd -d /home/deploy deploy
echo -e "\tStrictHostKeyChecking no" >> /etc/ssh/ssh_config
#ssh-keygen -t rsa -f /home/deploy/.ssh/id_rsa -N '' -C deploy@$HOSTNAME
echo >> /home/deploy/.ssh/authorized_keys
cat /vagrant/shared/.ssh/id_rsa.pub >> /home/deploy/.ssh/authorized_keys
chown -R deploy: /home/deploy
