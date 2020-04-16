pipeline {
	agent any  
	stages {
		stage('Compile - Stage 1') {
			steps {
				echo 'Compilation is carried out here.'
				sh 'mvn clean'
			}
		}

		stage('Test - Stage 2') {
			steps {
				echo 'testing is carried out here.'
				sh 'mvn test'
			}
		}

		stage('Package - Stage 3') {
			steps {
				echo 'packaging is carried out here.'
				sh 'mvn package'
			}
		}

	}
}

