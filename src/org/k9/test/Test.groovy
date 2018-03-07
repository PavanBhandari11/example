package org.k9.test

class Test implements Serializable {
  def config
  def script

  Test(script,config) {
    this.config = config
    this.script = script
  }
  void wish() {
    this.script.stage('HBD'){
    this.script.echo "stage1" + this.config.name
  }
  }
  }
