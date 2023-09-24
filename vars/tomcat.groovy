sshagent(['Tomcat-server Credential']) {
                sh 'scp -o StrictHostKeyChecking=no target/01-maven-web-app.war ec2-user@100.24.66.20:/home/ec2-user/apache-tomcat-9.0.80/webapps'
