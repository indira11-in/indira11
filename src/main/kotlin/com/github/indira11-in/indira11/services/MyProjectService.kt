package com.github.indira11-in.indira11.services

import com.intellij.openapi.project.Project
import com.github.indira11-in.indira11.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
