pipeline{
    agent any
    
    tools{
        maven 'Maven-3.8.6'
    }
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/Rani445-eng/rani_nagwadiya.git'
            }
        }
        stage('version'){
            steps{
                sh 'mvn -v'
            }
        }
        stage('testing'){
            steps{
                echo 'mvn test'
            }
        }
        
    }
}
