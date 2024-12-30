pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/username/repo.git'
            }
        }
        stage('Execute Bash Script') {
            steps {
                sh './script_name.sh'
            }
        }
    }
}
