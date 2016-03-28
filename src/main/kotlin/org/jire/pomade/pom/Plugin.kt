package org.jire.pomade.pom

open class Plugin(val artifact: Artifact, val executions: Set<Execution>) : XMLElement {

	override fun generate(indent: Int): String {
		var string = "${indent()}<plugin>\n${artifact.generate(indent + 1)}\n${indent(1)}<executions>\n"
		executions.forEach { string += it.generate(indent + 2) }
		return string + "${indent(1)}</executions>\n${indent()}</plugin>"
	}

}