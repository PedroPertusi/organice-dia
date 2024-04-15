pipeline {
    agent any
    stages {
        stage('Jenkins Dia') {
            steps {
                echo 'Jenkins Dia'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}