package org.jire.pomade.pom

class Build(val plugins: Set<Plugin>) : XMLElement {

	override fun generate(indent: Int): String {
		var string = "${indent()}<build>"
		for (plugin in plugins) string += "\n${plugin.generate(indent + 1)}"
		string += "\n${indent()}</build>"
		return string
	}

}