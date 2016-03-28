package org.jire.pomade

class ArtifactBuilder(val artifact: ProjectArtifactBuilder) {

	infix fun from(group: String) = Artifact(artifact.id, artifact.version, group)

}