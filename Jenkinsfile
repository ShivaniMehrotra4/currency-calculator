pipeline {
	agent any  
	stages {
		stage('Stage 1') {
			steps {
				echo 'Hello. Work under progress here.'
			}
		}
	}
	post {
		always {
			echo 'I will be executed always, P.S. I am in declarative pipeline\'s always block.'
		}
	}
}
