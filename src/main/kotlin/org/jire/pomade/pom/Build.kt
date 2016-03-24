package org.jire.pomade.pom

class Build(val plugins: Set<Plugin>) : XMLElement {

	override fun generate(indent: Int): String {
		var string = "${indent()}<build>\n"
		for (plugin in plugins) string += plugin.generate(1)
		string += "\n${indent()}</build>"
		return string
	}

}