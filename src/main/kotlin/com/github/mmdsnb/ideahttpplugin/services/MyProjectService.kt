package com.github.mmdsnb.ideahttpplugin.services

import com.intellij.openapi.project.Project
import com.github.mmdsnb.ideahttpplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
