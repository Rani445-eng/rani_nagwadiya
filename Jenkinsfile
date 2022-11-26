//CODE_CHANGES = getGitChanges()
pipeline{
    agent any
    environment{
        NEW_VERSION = '1.3.0'
        SERVER_CREDENTIALS = credentials('rani-nagwadiya')
    }
    
    stages{
        
        stage("test"){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps{
                echo 'this is test block'
                echo "test version ${NEW_VERSION}"
                echo "creds are ${SERVER_CREDENTIALS}"
            }
        }
    }
}

    
    



//pipeline{
  //  agent any
    
    //tools{
      //  maven 'Maven-3.8.6'
    //}
    //stages{
      //  stage('Git clone'){
        //    steps{
          //      git 'https://github.com/Rani445-eng/rani_nagwadiya.git'
            //}
        //}
        //stage('version'){
          //  steps{
            //    sh 'mvn -v'
            //}
        //}
        //stage('testing'){
          //  steps{
            //    echo 'mvn test'
            //}
       // }
        //stage('building'){
          //  steps{
            //    echo 'mvn build'
            //}
        //}
        
   // }
//}
