def call(Map config) {
    node {
        git url: "https://github.com/jenkinsci/warnings-plugin.git"
        sh 'mvn install'
        mail to: 'nitin.m@kloud9.nyc', subject: "${warnings-plugin} plugin build", body: 'mail'
    }
}
