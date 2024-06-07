def gv
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
          gv.buildJar()
        }
      }
    }

    stage("buildImage"){
      steps{
        script{
          gv.buildImage()
        }
      }
    }
  }
}