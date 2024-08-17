pipeline {
    agent any
    
    stages {
        stage('Get Source Code') {
            steps {
                echo "Hello, World!"
            }
        }
        stage('Build Code') {
            steps {
                bat 'mvn clean'
            }
        }
        stage('Run Test') {
            steps {
                bat 'mvn compile'
            }
        }
    }
}
