#!/usr/bin/env groovy

/**
 * Send notifications based on build status string
 */
def call(Closure body)
// Default values
  def colorName = 'RED'
  def colorCode = '#FF0000'
  def subject = "${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
  def summary = "${subject} (${env.BUILD_URL})"
  def details = """<p>${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
    <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""" {
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
