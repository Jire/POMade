package org.jire.pomade

const val INDENT_SPACING = "    "

interface XMLElement {

	fun generate(indent: Int = 0): String

	operator fun Int.invoke(extra: Int = 0): String {
		var spaces = ""
		for (i in 0..this + extra) spaces += INDENT_SPACING
		return spaces
	}

}