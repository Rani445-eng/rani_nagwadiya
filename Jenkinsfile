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
        stage('ansible ver'){
            steps{
                sh 'ansible --version'
               
            }
        }
        stage('ansible cmd'){
            steps{
                sh 'cat /etc/ansible/ansible.cfg'
                sh 'ansible localhost --list-hosts'
              //  sh 'ansible localhost -m user -a "name=newbie uid=4000 state=present"'
               
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
           
        
        
    

