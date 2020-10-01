pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                sh 'cd 7w-servlet-app-ci-cd/ && pwd && git pull origin master'
            }
        }
        stage('stop old app') {
            steps {
                echo 'Typically this is where I would stop my server'
            }
        }
        stage('build app'){
            steps{
                sh 'cd 7w-servlet-app-ci-cd/ && mvn clean package'
                
            }
        }
        stage('copy app'){
            steps{
                sh '''cd 7w-servlet-app-ci-cd/target/
                pwd
                cp my-pictures.war /home/ec2-user/apache-tomcat-8.5.58/webapps/'''
                
            }
        }
    }
}
