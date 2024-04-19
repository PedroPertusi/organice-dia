pipeline {
    agent any
    stages {
        stage('Build Lembrete') {
            steps {
                build job: 'organice-lembrete', wait: true
            }
        }
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