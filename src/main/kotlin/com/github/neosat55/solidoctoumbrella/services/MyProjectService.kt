package com.github.neosat55.solidoctoumbrella.services

import com.intellij.openapi.project.Project
import com.github.neosat55.solidoctoumbrella.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
