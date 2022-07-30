pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                    bat 'mvn install'
            }
        }
        
        stage('Deploy'){
            steps{
                bat 'dir'
                dir('/src/main/resources') {
                	bat 'dir'
                    bat 'docker-compose build'
                }
            }
        }
            
        }
    }
