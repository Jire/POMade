package org.jire.pomade

import org.jire.pomade.pom.*
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

object POMade {

	fun compile(body: Compile.() -> Any) {
		Compile.body()
	}

	fun plugins(body: Plugins.() -> Any) {
		Plugins.body()
	}

	infix fun String.to(value: String) {
		properties[this] = value
	}

	init {
		properties["kotlin.version"] = "1.0.2"
		plugins.add(kotlin)
		dependencies.add(Dependency(Artifact("org.jetbrains.kotlin",
				"kotlin-stdlib", "\${kotlin.version}")))
	}

}

operator fun String.get(version: String) = ProjectArtifactBuilder(this, version)

internal val plugins = HashSet<Plugin>()
private val build = Build(plugins)
internal val dependencies = HashSet<Dependency>()
internal val properties = HashMap<String, String>()

private val kotlinExecutions = HashSet<Execution>()
private val kotlin = object : Plugin(Artifact("org.jetbrains.kotlin",
		"kotlin-maven-plugin", "\${kotlin.version}"), kotlinExecutions) {
	init {
		kotlinExecutions.add(Execution("compile", "compile", setOf("compile"),
				Configuration(setOf("src/main/kotlin", "src/main/java"))))
		kotlinExecutions.add(Execution("test-compile", "test-compile", setOf("test-compile"),
				Configuration(setOf("src/main/kotlin", "src/main/java"))))
	}
}

fun pomade(ivg: Artifact) {
	POMade // ensures initialization

	val project = Project(artifact = ivg, build = build,
			dependencies = dependencies, properties = properties)
	Files.write(Paths.get("pom.xml"), project.generate().toByteArray())
}

fun pomade(ivg: Artifact, body: POMade.() -> Any) {
	POMade.body()
	pomade(ivg)
}