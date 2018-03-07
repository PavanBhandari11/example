package org.k9.git

class Scm implements Serializable {
  def config
  def script

  Scm(script,config) {
    this.config = config
    this.script = script
  }
  void git () {
    this.script.stage ('wishes'){
    this.script.echo "HBD" + this.comfig.name
  }

  void gitclone () {
     this.script.stage('Git clone') {
      git 'https://github.com/srinivasdevops376/springmvc-helloworld.git'
   }
  }
}
}
