pipeline{
    agent any
    parameters{
        string(name: 'version', defaultValue: '', description: 'deploy this on any iris')
        choice(name: 'versionn', choices: ['1.0', '2.0', '3.0'], description: '')
        booleanParam(name: 'executeTests', deafaultValue: true, description: '')
    }
    stages{
        stage("test"){
            when{
                expression{
                    params.exectuteTests
                }
            }
            steps{
                echo 'testng successfull'
            }
        }
        stage{
            stages('deploy'){
                steps{
                    echo "deploying version ${params.versionn}"
                }
            }
        }
    }
}

    
    
    
    
    
//    tools {
//        gradle 'Gradle-6.2'
    
 //   }
  //  stages{
    //    stage('yarn block'){
      //      steps{
        //        nodejs('Node-10.17'){
          //          sh 'npm install'
            //    }
            //}
//        }
  //      stage('Gradle block'){
    //        steps{
      //              sh "gradleww -v"
               
        //    }
    //    }
        
   // }
    //post{
      //  failure{
        //    echo "this is post block"
        //}
    //}
    
//}
