package org.jire.pomade.pom

data class Configuration(val sourceDirs: Set<String>) : XMLElement {

	override fun generate(indent: Int): String {
		var string = "${indent()}<configuration>\n${indent(1)}<sourceDirs>"
		sourceDirs.forEach { string += "\n${indent(2)}<source>$it</source>" }
		return string + "\n${indent(1)}</sourceDirs>\n${indent()}</configuration>\n"
	}

}