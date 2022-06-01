pipelineJob(backend) {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            credentials("")
            url("https://github.com/ikorkosz/Backend.git")
          }
          branches('master')
          scriptPath('Jenkinsfile')
        } 
      } 
    } 
  } 
}
