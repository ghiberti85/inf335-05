pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clona o código fonte do repositório
                git branch: 'main', url: 'https://github.com/ghiberti85/inf335-05.git'
            }
        }
        stage('Build') {
            steps {
                // Compila o projeto Maven
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Executa os testes JUnit
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            // Publica os resultados dos testes no console do Jenkins
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
