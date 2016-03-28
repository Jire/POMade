package org.jire.pomade

class ProjectArtifactBuilder(val id: String, val version: String) {

	infix fun from(group: String) = Artifact(id, version, group)

}