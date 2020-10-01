pipeline {
    agent any

    stages {
        stage('stop old app') {
            steps {
                echo 'Typically this is where I would stop my server'
            }
        }
        stage('build app'){
            steps{
                sh 'mvn clean package'
                
            }
        }
        stage('copy app'){
            steps{
                sh 'cp target/my-pictures.war /home/ec2-user/apache-tomcat-8.5.58/webapps/'
                
            }
        }
        stage('start new app') {
            steps {
                echo 'Typically this is where I would start my server'
            }
        }
    }
}
