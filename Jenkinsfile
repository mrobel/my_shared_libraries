@Library('robel_shared_lib') _
pipeline{
    agent any
        tools{
            maven "Maven-3.9.4"
        }
        stages{
            stage('Git Clone'){
                steps{
                    git 'https://github.com/mrobel/maven-web-app.git'
                }
            } 
            stage('Build'){
                steps{
                    mavenBuild()
                }
            }
            stage('Code Review'){
                steps{
                echo "Welcome Sonar Next time Server not ready so"
                }
            }
            stage('Artifact upload'){
                steps{
                    nexus()
                }
            }
            stage('Deploy'){
                steps{
                    tomcat()
                }
            }
        }
    }
