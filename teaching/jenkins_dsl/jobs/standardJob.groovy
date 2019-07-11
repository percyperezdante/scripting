folder('A')         // Creating a folder
job("A/demojob"){  // Creating a job inside A folder
    scm{
        git{
            remote{
                url('https://github.com/lexandro/restapi-demo.git')
                branch('master')
            }
        }
    }
    steps{
        maven('clean')
    }
}


