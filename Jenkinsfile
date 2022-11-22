pipeline{
    agent any
    
    stages{
        stage('docker'){
            steps{
                sh 'docker -v'
            }
        }
        stage('create image'){
            steps{
                sh 'docker build -t rani-img:latest .'
            }
        }
    }
}
        
        //stage('Nodejs'){
          //  steps{
               // nodejs('Node-10.17'){
                 //   sh 'npm install'
               // }
           // }
      //  }
        //stage('Gradle block'){
          //  steps{
            //    withGradle(){
              //      sh "gradlew clean assembleRelease"
                //}
           
        
        
    

