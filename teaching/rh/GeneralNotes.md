# Red Hat Enterprise notes

## File system

- Password /etc/passwd file

```
jenkins:x:498:498:Jenkins Automation Server:/var/lib/jenkins:/bin/false


jenkins : user name
x       : shadow file
498     : user id of user name in the system
498     : primary group id
Jenkins Automation Server : Real name
/var/lib/jenkins          : Home directory
/bin/false                : shell prompt exit
/bin/nologin              : shell exit with message



```

- Shadow file

```
gopher:asdfadfas!/asdf:15937:0:99999:7:::
ftp:*:15937:0:99999:7:::

gopher      : user account
*           : never had a password 
asdfadfas!  : encrypt password
!!          : no password
```

- Group file /etc/group

```
splunk:x:7301:jjj

splunk     : group name
x          : no password
7301       : group number
jjj        : group members accounts
```

## Users

-  useradd

TODO complete with examples


 
