package com.github.mferrer.krotoplus

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

class KrotoPlusGradlePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.create("krotoPlus", KrotoPlusPluginExtension::class.java)

        project.tasks.create("generateKrotoPlus", GenerateKrotoTask::class.java)
                .doLast { println("Kroto+ DONE") }
    }
}

open class KrotoPlusPluginExtension(open var sources:List<String> = emptyList(), open var outputDir: String = "")

open class GenerateKrotoTask : DefaultTask() {

    private val ext = project.extensions.getByName("krotoPlus") as KrotoPlusPluginExtension

    @TaskAction
    open fun generate() {

        val cliArgs = mutableListOf(
                //Path to CLI jar
                Manifest::class.java.protectionDomain.codeSource.location.toURI().path
        ).apply {
            //User defined source directories
            addAll( ext.sources)

            //User defined output directory
            add("-o")
            add(ext.outputDir)
        }

        //Execute CLI
        project.javaexec{
            it.main = "-jar"
            it.args = cliArgs
        }
    }
}