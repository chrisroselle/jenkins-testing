pipelineJob('shared-lib') {
    description 'example using shared library'
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
            scriptPath('JenkinsfileSharedLib')
        }
    }
}