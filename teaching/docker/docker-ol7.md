# Docker in Oracle Linux 7

##  How to install docker-ce
```
    yum -y install yum-utils
    yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
    yum -y install docker-ce

```
 
https://blog.dbi-services.com/docker-ce-on-oracle-enterprise-linux-7/


##  How to enable and start docker-ce service

```
    systemctl enable docker   
    systemctl start docker

```

"systemctl enable docker"  creates a link to the /usr/lib/systemd/system/ folder where all services are located. Enable means create a link to /etc/systemd/system/
```
Created symlink from /etc/systemd/system/multi-user.target.wants/docker.service to /usr/lib/systemd/system/docker.service.
```


##  How to set crontabs

- The file to update is located at  /var/spool/cron/ . You can create a root file that contains the schedule of tasks to be executed.

- To restart crond   systemctl restart crond
- crontab -l    shows the available tasks
- crontab -e    edits the crontab file at /var/spool/cron/



