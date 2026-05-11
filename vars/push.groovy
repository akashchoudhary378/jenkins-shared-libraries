def call( String username , String projectName , String tag )
{
  echo "this is pushing the image in docker hub the code"
                withCredentials([usernamePassword(
                    credentialsId:"dockerHubCred",
                    passwordVariable:"dockerHubPass",
                    usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass} "
                sh "docker image tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
                sh "docker push ${username}/${projectName}:${tag}"
              
}
