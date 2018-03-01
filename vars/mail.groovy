def call(Closure body) {
    node('maven') {
        body()
// Send notifications
  slackSend (color: colorCode, message: summary)

  hipchatSend (color: color, notify: true, message: summary)

  emailext (
      to: 'nitin.m@kloud9.nyc',
      subject: subject,
      body: details,
      recipientProviders: [[$class: 'DevelopersRecipientProvider']]
    )
        }
   }
}
