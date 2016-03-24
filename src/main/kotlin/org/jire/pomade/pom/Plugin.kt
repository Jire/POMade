package org.jire.pomade.pom

class Plugin(val artifact: Artifact) : XMLElement {

	override fun generate(indent: Int) = "${indent()}<plugin>\n${artifact.generate(1)}\n${indent()}</plugin>"

}