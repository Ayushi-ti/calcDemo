pipeline {
    agent any
    stages {
        stage('Compile') {
            steps{
                sh 'depends'
            }
        }
    }
    post {
        failure {
            mail bcc: '', body: "$BUILD_NUMBER", subject: "$JOB_NAME", to: 'java.kumar.arun@gmail.com'
        }
        success {
            mail bcc: '', body: "$BUILD_NUMBER", subject: "$JOB_NAME", to: 'java.kumar.arun@gmail.com'
        }      
    }
}