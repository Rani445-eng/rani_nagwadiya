pipeline{
    agent any
    
    tools {
        gradle 'Gradle-6.2'
    
    }
    stages{
        stage('yarn block'){
            steps{
                nodejs('Node-10.17'){
                    sh 'npm install'
                }
            }
        }
        stage('Gradle block'){
            steps{
                    sh "gradle -v"
               
            }
        }
        
    }
}
