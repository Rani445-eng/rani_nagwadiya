pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/Rani445-eng/rani_nagwadiya.git'
            }
        }
        stage('Creating DockerImage'){
            steps{
                sh 'docker build -t rani-pipeline-jdk:latest .'
            }
        }
        
    }
}
