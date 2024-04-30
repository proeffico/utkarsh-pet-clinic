pipeline {

	agent {
		label 'maven'
	}

	stages {
		stage('Build Package') {
			steps {
				sh "mvn --version"
				sh "java --version"
				sh "mvn clean package"
				sh "ls -lrt target/"
			}
		}

		

		stage('Build Image') {
			steps {
				timeout(time: 1, unit: 'HOURS'){
				echo "Building image..."
				sh "oc apply -f cicd/Build-Config.xml"
				sh "oc start-build buildconfig/aksumjava --from-file=target/utk-pet-clinic-0.0.1-SNAPSHOT.jar"
				}
			}
		}

		stage('Deploy Service') {
			steps {
				echo "Deploying service..."
				sh "oc apply -f cicd/Deployment.xml"
			}
		}
	}
}
