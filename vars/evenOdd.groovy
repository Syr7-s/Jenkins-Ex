
Skip to content
Product 
Team
Enterprise
Explore 
Marketplace
Pricing 
Search
Sign in
Sign up
robertstarmer
/
evenOdd
Public
Code
Issues
Pull requests
1
Actions
Projects
Wiki
Security
Insights
evenOdd/vars/evenOdd.groovy
@robertstarmer
robertstarmer Add initial code
Latest commit 7d14afc on 7 Jun 2018
 History
 1 contributor
34 lines (34 sloc)  693 Bytes
   
// vars/evenOrOdd.groovy
def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even"
            script { 
              log.info 'Starting even build'
              log.warning 'Nothing to do!'
            }
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Odd Stage') {
          steps {
            echo "The build number is odd"
            script { 
              log.info 'Starting odd build'
              log.warning 'Nothing to do!'
            }
          }
        }
      }
    }
  }
}
