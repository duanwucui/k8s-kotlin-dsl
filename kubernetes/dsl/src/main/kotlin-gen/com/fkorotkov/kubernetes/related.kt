// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Event
import io.fabric8.kubernetes.api.model.ObjectReference


fun  Event.`related`(block: ObjectReference.() -> Unit = {}) {
  if(this.`related` == null) {
    this.`related` = ObjectReference()
  }

  this.`related`.block()
}

