import groovy.transform.Field
import org.jenkinsci.plugins.workflow.support.steps.build.RunWrapper

@Field example = ['one', 'two']

@NonCPS
String getLogFromRunWrapper(RunWrapper runWrapper, int logLines) {
    return runWrapper.getRawBuild().getLog(logLines)
}