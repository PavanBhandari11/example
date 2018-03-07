package org.k9.first

class First implements Serializable {
  def config
  def script

  First(script,config) {
    this.config = config
    this.script = script
  }
void wish()
  {
    this.script.stage('HBD'){
    this.script.sh('echo First' + this.config.name)
  } 
  }
}
