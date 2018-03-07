package org.k9.demo 

class One {
  def config
  def script

  One(script, config) {
    this.config = config
    this.script = script
  }

  void tdemo() {
    this.script.stage('Building Image') {
       this.script.echo "stage " + this.config.version
    }
  }
}
