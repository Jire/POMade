package org.jire.pomade.pom

class Build(val plugins: Set<Plugin>) : XMLElement {

	override fun generate(indent: Int): String {
		var string = "${indent()}<build>\n${indent(1)}<plugins>"
		for (plugin in plugins) string += "\n${plugin.generate(indent + 2)}"
		string += "\n${indent(1)}</plugins>\n${indent()}</build>"
		return string
	}

}