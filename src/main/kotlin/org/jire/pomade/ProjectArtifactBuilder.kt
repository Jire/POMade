package org.jire.pomade

import org.jire.pomade.pom.Artifact

class ProjectArtifactBuilder(val id: String, val version: String) {

	infix fun from(group: String) = Artifact(id, version, group)

}