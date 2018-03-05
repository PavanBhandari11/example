    def call(body) {
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    def call(String buildStatus = 'STARTED')
    def colorName = 'RED'
    def colorCode = '#FF0000'
    def subject = "${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
    def summary = "${subject} (${env.BUILD_URL})"
    def details = """<p>${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
    <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>"""
    // Override default values based on build status
    if (buildStatus == 'STARTED') {
    color = 'YELLOW'
    colorCode = '#FFFF00'
    } else if (buildStatus == 'SUCCESS') {
    color = 'GREEN'
    colorCode = '#00FF00'
    } else {
    color = 'RED'
    colorCode = '#FF0000'
    }
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

  node {
      emailext (
          to:'nitin.m@kloud9.nyc',
          subject: 'subject',
          body: 'details',
        )
  }
}
