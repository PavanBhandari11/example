package org.k9.gitt
import org.k9.*

class Git {
  def config
  def script

  Git(script,config) {
    this.config = config
    this.script = script
  }
  
  void checkout(){   
  this.script.stage ('git checkout') {
  this.script.git(giturl:this.config.giturl, branch:this.config.branch)
  }
  }
}
