package com.github.brouwert.pycharminvokeplugin.services

import com.github.brouwert.pycharminvokeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
