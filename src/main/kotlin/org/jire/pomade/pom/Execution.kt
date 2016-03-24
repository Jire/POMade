package org.jire.pomade.pom

data class Execution(val id: String, val phase: String, val goals: Set<String>,
                     val configuration: Configuration) : XMLElement {

	override fun generate(indent: Int): String {
		var string = "${indent()}<execution>\n${indent(1)}<id>$id</id>\n" +
				"${indent(1)}<phase>$phase</phase>\n${indent(1)}<goals>"
		goals.forEach { string += "\n${indent(2)}<goal>$it</goal>" }
		return string + "\n${indent(1)}</goals>\n${configuration.generate(4)}${indent()}</execution>\n"
	}

}