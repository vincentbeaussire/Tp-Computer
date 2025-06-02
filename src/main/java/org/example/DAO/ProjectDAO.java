package org.example.DAO;

import org.example.entity.Project;
import org.example.util.DatabaseManager;

import javax.lang.model.element.TypeElement;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProjectDAO {

    public static EntityManager em;

    public ProjectDAO() {
        em = DatabaseManager.getEntityManager();
    }
    public static Project createProject(Project project) {
        em.getTransaction().begin();
        em.persist(project);
        em.getTransaction().commit();
        return project;
    }

    public List<Project> getAllProjects() {
        return em.createQuery("select p from Project p", Project.class).getResultList();
    }

    public List<Project> getProject(String name, String description) {
        TypedQuery<Project> query = em.createQuery("select p from Project p where p.name = :name and p.description = :description", Project.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    public List<Project> updateProject(int id, String name, String description) {
        TypedQuery<Project> query = em.createQuery("update Project p set p.name = :name where p.id = :id", Project.class);
        query.setParameter("id", id);
        return query.getResultList();
    }

    public List<Project> deleteProject(int id, String name, String description) {
        TypedQuery<Project> query = em.createQuery("delete from Project p where p.id = :id", Project.class);
        query.setParameter("id", id);
        return query.getResultList();
    }
}
