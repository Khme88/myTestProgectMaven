pipeline {
    agent any

    tools {
        jdk "1.17"
        maven "3.9.9"
    }

    parameters{
        booleanParams(defaultValue: true, description: 'run tests', name: 'allTests')
//         booleanParams(defaultValue: true, description: 'run tests', name: 'all tests')
    }

    stages {
        stage('allTests') {
            when{
                expression{return params.allTests}
            }
            steps {
                // Get some code from a GitHub repository
//                 git url: 'https://github.com/Khme88/myTestProgectMaven.git',
//                     branch: 'master'
//                     credentialsId: "jenkins"
                sh "mvn test"
            }

        stage('allTests') {
            when{
                expression{return params.allTests}
            }
//             steps {
//                 // Get some code from a GitHub repository
// //                 git url: 'https://github.com/Khme88/myTestProgectMaven.git',
// //                     branch: 'master'
//                     // ,credentialsId: "jenkins"
//
//                 // Run Maven on a Unix agent.
//                 sh "mvn test"
//
//                 // To run Maven on a Windows agent, use
//                 // bat "mvn -Dmaven.test.failure.ignore=true clean package"
//             }

            post {
                always{
                    allure([
                        reportBuildPolicy: 'ALWAYS',
                        result: [[path: 'allure-results']]
                    ])
                }
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}