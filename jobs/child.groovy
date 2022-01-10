pipelineJob('child') {
    description 'does it work?'
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('chrisroselle/jenkins-testing')
                    }
                    branch('refs/heads/master')
                }
            }
            lightweight()
            scriptPath('Jenkinsfile')
        }
    }
}