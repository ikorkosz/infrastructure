pipelineJob(frontend) {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            credentials("")
            url("https://github.com/ikorkosz/Frontend.git")
          }
          branches('master')
          scriptPath('Jenkinsfile')
        } 
      } 
    } 
  } 
}
