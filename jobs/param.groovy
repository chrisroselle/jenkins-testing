import jenkins.model.Jenkins
import hudson.model.Item
import hudson.model.Items

def name = 'param'
def description = 'parameter example'
def githubPath = 'chrisroselle/jenkins-testing'
def branch = 'refs/heads/testcr'
def jenkinsfilePath = 'JenkinsfileParam'

// this is a workaround for parameters being wiped out when job is regenerated
// https://issues.jenkins.io/browse/JENKINS-43758?focusedCommentId=408718&page=com.atlassian.jira.plugin.system.issuetabpanels:comment-tabpanel#comment-408718
def jobProperties
Item currentJob = Jenkins.instance.getItemByFullName(name)
if (currentJob) {
    jobProperties = currentJob.@properties
}

pipelineJob(name) {
    description(description)
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github(githubPath)
                    }
                    branch(branch)
                }
            }
            lightweight()
            scriptPath(jenkinsfilePath)
        }
    }
    if (jobProperties) {
        configure { root ->
            def properties = root / 'properties'
            jobProperties.each { property ->
                String xml = Items.XSTREAM2.toXML(property)
                def jobPropertiesPropertyNode = new XmlParser().parseText(xml)
                properties << jobPropertiesPropertyNode
            }
        }
    }
}