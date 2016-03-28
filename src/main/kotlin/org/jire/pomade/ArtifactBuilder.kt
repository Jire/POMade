package org.jire.pomade

import org.jire.pomade.pom.Artifact

class ArtifactBuilder(val artifact: ProjectArtifactBuilder) {

	infix fun from(group: String) = Artifact(artifact.artifactId, artifact.version, group)

}