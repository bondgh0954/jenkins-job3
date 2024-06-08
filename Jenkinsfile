#!/user/bin/env groovy
def gv
@library('jenkins-shared')
pipeline{
  agent any
  tools{
    maven 'maven-3'
  }

  stages{
    stage("init"){
      steps{
        script{
          gv = load "script.groovy"
        }
      }
    }
    stage("buildJar"){
      steps{
        script{
          buildJar()
        }
      }
    }

    stage("buildImage"){
      steps{
        script{
          buildImage 'nanaot/java-app.7.5'
        }
      }
    }
  }
}