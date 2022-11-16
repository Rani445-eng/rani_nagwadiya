pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/Rani445-eng/rani_nagwadiya.git'
            }
        }
        stage('build image'){
            steps{
                sh 'docker build -t rani_pipeline_img:latest .'
            }
        }
        
    }
}
