// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.rbac.KubernetesClusterRoleBinding
import io.fabric8.kubernetes.api.model.rbac.KubernetesRoleBinding
import io.fabric8.kubernetes.api.model.rbac.KubernetesRoleRef


fun  KubernetesClusterRoleBinding.`roleRef`(block: KubernetesRoleRef.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = KubernetesRoleRef()
  }

  this.`roleRef`.block()
}


fun  KubernetesRoleBinding.`roleRef`(block: KubernetesRoleRef.() -> Unit = {}) {
  if(this.`roleRef` == null) {
    this.`roleRef` = KubernetesRoleRef()
  }

  this.`roleRef`.block()
}

