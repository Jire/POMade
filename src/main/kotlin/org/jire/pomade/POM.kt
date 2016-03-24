package org.jire.pomade

import org.jire.pomade.build.Build
import org.jire.pomade.dependencies.Dependency

data class POM(val modelVersion: String = "4.0.0", val artifact: Artifact, val build: Build,
               val dependencies: Set<Dependency>, val properties: Map<String, String>) : XMLElement {

	override fun generate(indent: Int): String {
		var string = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<project " +
				"xmlns=\"http://maven.apache.org/POM/$modelVersion\"\n" +
				"${indent(2)}xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
				"${indent(2)}xsi:schemaLocation=\"http://maven.apache.org/POM/$modelVersion " +
				"http://maven.apache.org/xsd/maven-$modelVersion.xsd\">\n" +
				"${indent()}<modelVersion>$modelVersion</modelVersion>"
		string += "\n\n${artifact.generate()}\n\n${build.generate()}\n\n${indent()}<dependencies>\n"
		dependencies.forEach { string += it.generate(1) }
		string += "\n${indent()}</dependencies>\n\n${indent()}<properties>"
		properties.forEach { string += "\n${indent(1)}<${it.key}>${it.value}</${it.key}>" }
		return "$string\n${indent()}</properties>\n\n</project>"
	}

}