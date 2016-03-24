package org.jire.pomade.build

import org.jire.pomade.XMLElement
import org.jire.pomade.build.plugins.Plugin

class Build(val plugins: Set<Plugin>) : XMLElement {

	override fun generate(indent: Int) = "${indent()}<build>\n${indent()}</build>"

}