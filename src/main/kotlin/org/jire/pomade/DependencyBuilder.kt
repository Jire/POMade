package org.jire.pomade

import org.jire.pomade.pom.Artifact
import org.jire.pomade.pom.Dependency

class DependencyBuilder(val id: String, val version: String) {

	infix fun from(group: String) = dependencies.add(Dependency(Artifact(group, id, version)))

}