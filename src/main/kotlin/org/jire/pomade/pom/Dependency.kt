package org.jire.pomade.pom

data class Dependency(val artifact: Artifact, val scope: String = "compile") : XMLElement {

	override fun generate(indent: Int) = "${indent()}<dependency>\n${artifact.generate(indent + 1)}" +
			"\n${indent(1)}<scope>$scope</scope>\n${indent()}</dependency>"

}