def call() {           
    sshagent(['Tomcat-server Credential']) {
    sh 'scp -o StrictHostKeyChecking=no target/01-maven-web-app.war ec2-user@54.158.144.215:/home/ec2-user/apache-tomcat-9.0.80/webapps'
   }
}
