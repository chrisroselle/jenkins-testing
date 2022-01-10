pipelineJob('folder1/folder2/child') {
    description '''
a longer description
now with multiple lines
'''
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
            scriptPath('Jenkinsfile')
        }
    }
}