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
  }
  }
