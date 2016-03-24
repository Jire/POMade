package org.jire.pomade.pom

data class Artifact(val groupId: String, val artifactId: String, val version: String) : XMLElement {

	override fun generate(indent: Int) = "${indent()}<groupId>$groupId</groupId>\n" +
			"${indent()}<artifactId>$artifactId</artifactId>\n${indent()}<version>$version</version>"

}