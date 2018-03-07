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
    this.script.stage('wish'){
    this.script.sh('echo HBD' + this.config.name)
  } 
  }
}
