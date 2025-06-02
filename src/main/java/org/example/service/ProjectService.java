package org.example.service;

import org.example.DAO.ProjectDAO;
import org.example.entity.Project;

public class ProjectService {

    private ProjectDAO projectDAO;

    public ProjectService() {  this.projectDAO = new ProjectDAO(); }

    public Project create (String name, String description) {
        Project project = Project.builder().name("Projet Formation M2i").description("Formation en programmation Java ").build();
        return ProjectDAO.createProject(project);
    }
}
