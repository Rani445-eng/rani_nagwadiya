pipeline{
    agent any
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
                withGradle(){
                    sh './gradlew clean assembleRelease'
                }
            }
        }
        
    }
}
