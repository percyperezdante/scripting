
# Red had management

## Log files /var/log

Some of the main logs

```
messages     : OS messages, example: start messages, booting, print on console
dmesg        : kernel messages
secure       : secure logs, such as root, login, sudo
```

## Syslog /etc/

-  rsyslog.conf

The RULES section provides the granularity of location to store logs

## Process 

- Help for signals 
```
man 7 signal
```

-- Process tree

```
pstree
```

## Network services

-  /etc/init.d directory
- service      : start /stop utility
- chkconfig    : run atuomatically
- systemd      : safe and faster start/stop service, instead of init.d
- systemctl, sysctl    : tool to manage systemd, 

## Packages

- rpm    : to install package "rpm -ivh PACAKGE NAME", it does not manage dependencies.
- yum    : Yellow update management, manage dependencies.
         : yum list installed
         : yum serach
         : yum erase

## Repositories /var/lib/rpm

- rpm -qf ` which pwd `    => to get the rpm of /bin/pwd
- rpm -qdf `which pwd`     => to get the documentation files for /bin/pwd
- rpm -qip RPM-FILE        => provides information of the RPM file
 

[
