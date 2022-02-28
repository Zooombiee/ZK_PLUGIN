package com.github.zooombiee.zkplugin.services

import com.intellij.openapi.project.Project
import com.github.zooombiee.zkplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
