package org.jire.pomade

object Compile {

	operator fun String.get(version: String) = DependencyBuilder(this, version)

}