package org.k9.*

class Test implements Serializable {
  def config
  def script

  Test(script,config) {
    this.config = config
    this.script = script
  }
  void wish() {
    this.script.stage ('wishes'){
    this.script.echo "stage1" + this.comfig.name
  }
     this.script.stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/srinivasdevops376/springmvc-helloworld.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = '/opt/maven'
      usrHome = '/home/srinivasdevops376'
   }
  }
}
