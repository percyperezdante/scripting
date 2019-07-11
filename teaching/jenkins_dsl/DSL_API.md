# Jenkins DSL API very quick reference

## Create folders
```bash
folder('project-a') {
    displayName('Project A')
    description('Folder for project A')
}

folder('project-a/testing') {
    description('Folder containing all QA jobs for project A')
}
```




## Reference
https://jenkinsci.github.io/job-dsl-plugin/#path/folder
https://marcesher.com/2016/07/01/jenkins-as-code-creating-jobs-from-the-command-line-during-development/
https://github.com/cfpb/jenkins-as-code-starter-project
https://marcesher.com/2016/06/08/jenkins-as-code-creating-jenkins-jobs-with-text-not-clicks/


https://github.com/jenkinsci/job-dsl-plugin/wiki/Tutorial---Using-the-Jenkins-Job-DSL
https://opensource.com/article/18/8/devops-jenkins-2


https://github.com/jenkinsci/job-dsl-plugin/wiki/Job-DSL-Commands
https://jenkinsci.github.io/job-dsl-plugin/#path/job
http://wiki.ciscolinux.co.uk/index.php?title=Jenkins_DSL_and_Pipeline

