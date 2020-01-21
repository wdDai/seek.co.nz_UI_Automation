
pipeline {
    agent any
    tools{
             maven 'Maven 3.6.2'
         }

    stages {
        stage('build') {
             steps {
                git branch: 'wip',
                credentialsId: 'a60f361f-7560-4eb2-af7f-3d5189fd1f4b',
                url: 'git@github.com:wdDai/seek.co.nz_UI_Automation.git'

                sh "mvn -DskipTests=true clean package"
             }


      }

        stage('test'){
                steps{
                    sh "mvn test"
            }

                post {
                    success {
                       junit '**/target/surefire-reports/TEST-TestSuite.xml'
                       archiveArtifacts 'target/*.jar'
                    }
         }
      }
   }
}