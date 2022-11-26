//CODE_CHANGES = getGitChanges()
pipeline{
    agent any
    environment{
        NEW_VERSION = '1.3.0'
    }
    
    stages{
        stage("build"){
            when{
                expression{
                    BRANCH_NAME == 'third' 
                }
            }
            steps{
                echo "build block"
            }
        }
        stage("test"){
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps{
                echo 'this is test block'
                echo 'test version ${NEW_VERSION}'
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
