package org.jire.pomade

import org.jire.pomade.pom.Artifact

class ProjectArtifactBuilder(val artifactId: String, val version: String) {

	infix fun from(group: String) = Artifact(group, artifactId, version)

}