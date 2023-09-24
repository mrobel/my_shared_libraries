def call() {           
    nexusArtifactUploader artifacts: [[artifactId: '01-maven-web-app', classifier: '', file: 'target/01-maven-web-app.war', type: 'war']], credentialsId: 'Nexus-credential', groupId: 'in.robelit', nexusUrl: '54.237.58.37:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'pipeline-repo', version: '1.0-SNAPSHOT'
}
