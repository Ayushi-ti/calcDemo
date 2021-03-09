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
            mail bcc: '', body: "$BUILD_NUMBER", subject: "$JOB_NAME", to: 'ayushi.ayushiibm@gmail.com'
        }
        success {
            mail bcc: '', body: "$BUILD_NUMBER", subject: "$JOB_NAME", to: 'ayushi.ayushiibm@gmail.com'
        }      
    }
}
