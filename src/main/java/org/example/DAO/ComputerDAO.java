package org.example.DAO;

import org.example.entity.Computer;
import org.example.entity.Identification;
import org.example.util.DatabaseManager;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ComputerDAO {

    private EntityManager em;

    public ComputerDAO() {
        em = DatabaseManager.getEntityManager();
    }

    public Computer createComputer (Computer computer) {
        em.getTransaction().begin();
        em.persist(computer);
        em.getTransaction().commit();
        return computer;
    }

    public List<Computer> getAll (){
        return em.createQuery("Select c from Computer c ", Computer.class).getResultList();
    }

    public List<Computer> getComputerByName(String name) {
        TypedQuery<Computer> query = em.createQuery("Select c from Computer c where c.name = :name", Computer.class);
        query.setParameter("name",name);
        return query.getResultList();
    }

    public List<Computer> updateComputerById(int id) {
        TypedQuery<Computer> query = em.createQuery("Select c from Computer c where c.id = :id", Computer.class);
        query.setParameter("id", id);
        return query.getResultList();
    }

    public List<Computer> deleteComputerById(int id) {
        TypedQuery<Computer> query = em.createQuery("Select c from Computer c where c.id = :id", Computer.class);
        query.setParameter("id",id);
        return query.getResultList();
    }
}
