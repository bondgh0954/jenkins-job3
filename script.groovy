def buildJar(){
    echo 'building jar file from the application'
    sh 'mvn package'
}
def buildImage(){
    echo "building docker image from the application"
    withCredentials([usernamePassword(credentialsId:'dockerhub-credentials',usernameVariable:"USER",passwordVariable:'PASS')]){
        sh "docker build -t nanaot/java-app:pipelinej.2.3 ."
        sh "echo $PASS |docker login -u $USER --password-stdin"
        sh "docker push nanaot/java-app:pipelinej.2.3"
    }
}
return this