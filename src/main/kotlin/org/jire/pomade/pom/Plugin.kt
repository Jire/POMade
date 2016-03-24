package org.jire.pomade.pom

class Plugin(val artifact: Artifact, val executions: Set<Execution>) : XMLElement {

	override fun generate(indent: Int): String {
		var string = "${indent()}<plugin>\n${artifact.generate(2)}\n${indent(1)}<executions>\n"
		executions.forEach { string += it.generate(3) }
		return string + "${indent(1)}</executions>\n${indent()}</plugin>"
	}

}