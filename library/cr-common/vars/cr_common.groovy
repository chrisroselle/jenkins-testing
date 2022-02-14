import groovy.transform.Field
import org.jenkinsci.plugins.workflow.support.steps.build.RunWrapper

@Field example = ['one', 'two']

@NonCPS
List<String> getLog(RunWrapper runWrapper, int logLines) {
    // https://javadoc.jenkins.io/hudson/model/Run.html#getLog-int-
    return runWrapper.getRawBuild().getLog(logLines)
}