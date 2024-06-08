
pipeline {
  agent any
  tools{
    maven 'maven-3'
  }

  stages{


    stage('build jar'){
      steps{
        script{
          echo 'building jar file from the application'
          sh 'mvn package'
        }
      }
    }

    stage('build Image'){
      steps{
        script{
          echo 'building docker image from the application'
              withCredentials([usernamePassword(credentialsId:'dockerhub-credentials',usernameVariable:'USER',passwordVariable:'PASS')]){
                  sh 'docker build -t nanaot/java-app:2.31 .'
                  sh "echo $PASS |docker login -u $USER --password-stdin"
                  sh "docker push nanaot/java-app:2.31"
              }
        }
      }
    }

  }
}
