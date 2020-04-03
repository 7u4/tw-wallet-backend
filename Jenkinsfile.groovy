pipeline {
  agent any
  environment {
    DB_USERNAME     = credentials('DB_USERNAME')
    DB_PASSWORD = credentials('TWPOINT_CONTRACT_ADDRESS')
    NODE1_PRIVATE_KEY = credentials('NODE1_PRIVATE_KEY')
    RPC_URL = credentials('RPC_URL')
    DOCKER_REG = "${DOCKER_REG}"
    TW_WALLET_IMAGE = "${DOCKER_REG}/tw-wallet:build-${BUILD_NUMBER}"
  }
  stages {
    stage('Build') {
      steps {
        sh 'make cache'
        sh 'make build'
      }
    }

    stage('Dockerize') {
      steps {
        sh 'aws ecr get-login-password | docker login  -u AWS --password-stdin $DOCKER_REG'
        sh 'make image TAG=$TW_WALLET_IMAGE'
        sh 'docker push $TW_WALLET_IMAGE'
        sh '/usr/local/bin/kompose convert -c -f docker/docker-compose.yml'
        sh 'cd docker; /usr/local/bin/docker-compose up -d'
      }
    }

    stage('Deploy') {
      steps {
        sh '/usr/local/bin/kompose convert -c -f docker/docker-compose.yml'
        // TODO: Remove this will real helm install
        sh 'cd docker; /usr/local/bin/docker-compose up -d'
      }
    }
  }
}


