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
                    bat 'docker-compose build'
                    bat 'docker-compose up -d'
            }
        }
            
        }
    }
