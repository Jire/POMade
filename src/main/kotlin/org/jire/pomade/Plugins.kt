package org.jire.pomade

import org.jire.pomade.pom.Plugin

object Plugins {

	operator fun Plugin.unaryPlus() = plugins.add(this)

}