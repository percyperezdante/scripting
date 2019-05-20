# Capistrano atomic test environment

This is a very small test environment to test capistrano 2 code.

# Before run your capistrano code

- Start vagrant boxes.
```bash
 $ vagrant status
 $ vagrant up
 $ vagrant status

```

- Verify that you have at least ssh to the machines using keys in shared/.ssh

    ```bash
      $ ssh -i shared/.ssh/id_rsa deploy@IP_ADDRESS 

    ```
    Answer yes to the question  "are you sure you want to continue connecting ?"
     
    TODO: This is a question asked only onces, but it is good practice to automate it.
          The todo is to avoid execute a manual ssh just for the first time.

- Add the deploy key in your local agent. This is used by capistrano 
    ```bash
      $ ssh-add shared/.ssh/id_rsa
    ```



# How to run your capistrano code.

```bash
$ cap -f deploy.cap  deploy

```



# TODO
- Automate first ssh to new vagrant boxes
- Automate using docker containers. Docker config files are uploaded but they are not
  working properly.


