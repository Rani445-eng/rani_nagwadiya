pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/Rani445-eng/rani_nagwadiya.git'
            }
        }
        stage('user name'){
            steps{
                sh 'whoami'
            }
        }
        stage('build image'){
            steps{
                echo 'building..'
            }
        }
        
    }
}
