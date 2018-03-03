def sendNotification(buildStatus) {
  if (buildStatus != 'SUCCESS') {
    // Do nothing - only interested when status becomes GREEN
    return
  }

  mattermostSend "${env.JOB_NAME} has recovered! (<${env.BUILD_URL}|See the build>)"
}

pipeline {
  
  post {
    changed {
      sendNotification(currentBuild.currentResult)
    }
  }
}
