package org.k9.git
import org.k9.gitcheckout.*

class git {
  def config
  def script

  git(script,config) {
    this.config = config
    this.script = script
  }
  
  void checkout(){   
  this.script.stage ('git checkout') {
  this.script.git(scm:this.config.giturl, branch:this.config.branch)
  }
  }
