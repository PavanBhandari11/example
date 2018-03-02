def call(body) {
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

  node {
      emailext (
          to: 'nitin.m@kloud9.nyc',
          subject: 'subject',
          body: 'details',
          recipientProviders: [[$class: 'DevelopersRecipientProvider']]
        )
  }
}
