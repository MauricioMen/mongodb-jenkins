pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                    sh 'mvn install'
            }
        }
        
        stage('Deploy'){
            steps{
                dir('/src/main/resources') {
                    sh 'docker compose build'
                }
            }
        }
            
        }
    }
