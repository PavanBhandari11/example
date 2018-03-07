package org.k9.demo

class Hello implements Serializable {
  def config
  def script

  Hello(script,config) {
    this.config = config
    this.script = script
  }
void wish()
  {
    this.script.stage('wish'){
    this.script.sh('echo Hello ' + this.config.name)
  } 
  }

}
