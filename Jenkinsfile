pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    environment {
        DOCKERHUB_CREDENTIALS_ID = 'onboni'
        DOCKERHUB_REPO = 'onboni/tempconverter'
        DOCKER_IMAGE_TAG = 'latest'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/onniluova/TempConverter.git'
            }
        }  
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                }
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    echo "Attempting to push image: ${docker.image.prefix}/${project.artifactId}:latest"
                    echo "Using credential ID: onboni"
                    withDockerRegistry([credentialsId: 'onboni', url: '']) {
                        bat "docker push ${docker.image.prefix}/${project.artifactId}:latest"
                    }
                }
            }
        }
}