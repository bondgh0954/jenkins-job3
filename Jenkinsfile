#!/user/bin/env groovy
@Library('jenkins-shared')
def gv
pipeline {
  agent any
  tools{
    maven 'maven-3'
  }

  stages{

    stage('init'){
      steps{
        script{
          gv = load 'script.groovy'
        }
      }
    }


    stage('build jar'){
      steps{
        script{
         buildJar()
        }
      }
    }

    stage('build Image'){
      steps{
        script{
         buildImage 'nanaot/java-app:8.0'
        }
      }
    }

  }
}
