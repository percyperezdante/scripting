

# Java based Jenkins client 

# How to install 

1. Download the jar file from your jenkins master.
```
$ wget https://jenkins.diginsite.net/jenkins/jnlpJars/jenkins-cli.jar
```
This will down load "jenkins-cli.jar" file.

2. Test the jar file
```
$ java -jar jenkins-cli.jar --help
```
You can help something like below
```
Neither -s nor the JENKINS_URL env var is specified.
Jenkins CLI
Usage: java -jar jenkins-cli.jar [-s URL] command [opts...] args...
Options:
-s URL       : the server URL (defaults to the JENKINS_URL env var)
-http        : use a plain CLI protocol over HTTP(S) (the default; mutually exclusive with -ssh and -remoting)
-ssh         : use SSH protocol (requires -user; SSH port must be open on server, and user must have registered a public key)
-remoting    : use deprecated Remoting channel protocol (if enabled on server; for compatibility with legacy commands or command modes only)
-i KEY       : SSH private key file used for authentication (for use with -ssh or -remoting)
-p HOST:PORT : HTTP proxy host and port for HTTPS proxy tunneling. See https://jenkins.io/redirect/cli-https-proxy-tunnel
-noCertificateCheck : bypass HTTPS certificate check entirely. Use with caution
-noKeyAuth   : dont try to load the SSH authentication private key. Conflicts with -i
-user        : specify user (for use with -ssh)
-strictHostKey : request strict host key checking (for use with -ssh)
-logger FINE : enable detailed logging from the client
-auth [ USER:SECRET | @FILE ] : specify username and either password or API token (or load from them both from a file);
for use with -http, or -remoting but only when the JNLP agent port is disabled

The available commands depend on the server. Run the help command to
see the list.

```

# How to use

This site presents the case to use jenkins-cli with http. You can do similar procedure with ssh

1. Update your publick key in Jenkins master

Go to Your account name => configure => SSH public keys, and copy your public key on the space.

Also you can get your token or the token of the account you are going to use by:

Go to your account name => Configure => Click on Show API token, and copy it in a hidden file as:
```
$ echo "user:token" > /hiden/directory/.secrets
```

2. Run the 

```
$ java -jar /path/to/jenkins-cli.jar -s http://hostname:8080/jenkins help

OR

$ java -jar /path/to/jenkins-cli.jar -s http://hostname:8080/jenkins -auth @/hidden/directory/.secrets  help

```
And you should get something such:

```
  add-job-to-view
    Adds jobs to view.
  build
    Builds a job, and optionally waits until its completion.
  cancel-quiet-down
    Cancel the effect of the "quiet-down" command.
  clear-queue
    Clears the build queue.
  connect-node
    Reconnect to a node(s)
  console
    Retrieves console output of a build.
  copy-job
    Copies a job.
  create-credentials-by-xml
    Create Credential by XML
  create-credentials-domain-by-xml
    Create Credentials Domain by XML
  create-job
    Creates a new job by reading stdin as a configuration XML file.
  create-node
    Creates a new node by reading stdin as a XML configuration.
  create-view
    Creates a new view by reading stdin as a XML configuration.
  declarative-linter
    Validate a Jenkinsfile containing a Declarative Pipeline
  delete-builds
    Deletes build record(s).
  delete-credentials
    Delete a Credential
  delete-credentials-domain
    Delete a Credentials Domain
  delete-job
    Deletes job(s).
  delete-node
    Deletes node(s)
  delete-view
    Deletes view(s).
  disable-job
    Disables a job.
  disconnect-node
    Disconnects from a node.
  enable-job
    Enables a job.
  get-credentials-as-xml
    Get a Credentials as XML (secrets redacted)
  get-credentials-domain-as-xml
    Get a Credentials Domain as XML
  get-gradle
    List available gradle installations
  get-job
    Dumps the job definition XML to stdout.
  get-node
    Dumps the node definition XML to stdout.
  get-view
    Dumps the view definition XML to stdout.
  groovy
    Executes the specified Groovy script.
  groovysh
    Runs an interactive groovy shell.
  help
    Lists all the available commands or a detailed description of single command.
  install-plugin
    Installs a plugin either from a file, an URL, or from update center.
  install-tool
    Performs automatic tool installation, and print its location to stdout. Can be only called from inside a build. [deprecated]
  keep-build
    Mark the build to keep the build forever.
  list-changes
    Dumps the changelog for the specified build(s).
  list-credentials
    Lists the Credentials in a specific Store
  list-credentials-context-resolvers
    List Credentials Context Resolvers
  list-credentials-providers
    List Credentials Providers
  list-jobs
    Lists all jobs in a specific view or item group.
  list-plugins
    Outputs a list of installed plugins.
  login
    Saves the current credentials to allow future commands to run without explicit credential information. [deprecated]
  logout
    Deletes the credentials stored with the login command. [deprecated]
  mail
    Reads stdin and sends that out as an e-mail.
  offline-node
    Stop using a node for performing builds temporarily, until the next "online-node" command.
  online-node
    Resume using a node for performing builds, to cancel out the earlier "offline-node" command.
  quiet-down
    Quiet down Jenkins, in preparation for a restart. Don’t start any builds.
  reload-configuration
    Discard all the loaded data in memory and reload everything from file system. Useful when you modified config files directly on disk.
  reload-job
    Reload job(s)
  remove-job-from-view
    Removes jobs from view.
  replay-pipeline
    Replay a Pipeline build with edited script taken from standard input
  restart
    Restart Jenkins.
  safe-restart
    Safely restart Jenkins.
  safe-shutdown
    Puts Jenkins into the quiet mode, wait for existing builds to be completed, and then shut down Jenkins.
  session-id
    Outputs the session ID, which changes every time Jenkins restarts.
  set-build-description
    Sets the description of a build.
  set-build-display-name
    Sets the displayName of a build.
  set-build-parameter
    Update/set the build parameter of the current build in progress. [deprecated]
  set-build-result
    Sets the result of the current build. Works only if invoked from within a build. [deprecated]
  set-external-build-result
    Set external monitor job result.
  shutdown
    Immediately shuts down Jenkins server.
  update-credentials-by-xml
    Update Credentials by XML
  update-credentials-domain-by-xml
    Update Credentials Domain by XML
  update-job
    Updates the job definition XML from stdin. The opposite of the get-job command.
  update-node
    Updates the node definition XML from stdin. The opposite of the get-node command.
  update-view
    Updates the view definition XML from stdin. The opposite of the get-view command.
  version
    Outputs the current version.
  wait-node-offline
    Wait for a node to become offline.
  wait-node-online
    Wait for a node to become online.
  who-am-i
    Reports your credential and permissions.

```

# How to run groovy scripts

To run a groovy script directly in Jenkins master:
```
$ java -jar /path/to/jenkins-cli.jar -s http://hostname:8080/jenkins -auth @/hidden/directory/.secrets groovy = < my_script.groovy
```

In here :

- groovy  is a subcommand from jenkins-cli.jar
- "=" instructs jenkins-cli.jar to expect stdin to provide a script to run
- "<" feeds the contentof the groovy script to jenkins-cli.jar


# References
- https://jenkins.io/doc/book/managing/cli/
- https://xanderx.com/post/run-jenkins-script-console-scripts-from-command-line-without-remoting/

