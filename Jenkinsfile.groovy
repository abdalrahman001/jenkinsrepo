pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/abdalrahman001/jenkinsrepo'
            }
        }
        stage('Set Executable Permission') {
            steps {
                sh 'chmod +x ./ls.sh'
            }
        }
        stage('Execute Bash Script') {
            steps {
                sh './ls.sh'  
            }
        }
    }
}