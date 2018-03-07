package org.k9.fest
class Wish implements Serializable {
  def config
  def script

  Wish(script,config) {
    this.config = config
    this.script = script
  }
  void build() {
    this.script.stage('HBD'){
    this.script.echo "HBD" + this.config.name
  }
  }
  }
