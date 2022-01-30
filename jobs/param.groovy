pipelineJob('param') {
    description 'parameter example'
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('chrisroselle/jenkins-testing')
                    }
                    branch('refs/heads/main')
                }
            }
            lightweight()
            scriptPath('JenkinsfileParam')
        }
    }
}