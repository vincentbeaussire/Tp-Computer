package org.example.DAO;

import org.example.entity.Computer;
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

    public List<Computer> getComputerByName(String name) {
        TypedQuery<Computer> query = em.createNamedQuery("select c from Computer c where c.name = :name", Computer.class);
        query.setParameter("name",name);
        return query.getResultList();
    }

    public List<Computer> updateComputerByName(String name) {
        TypedQuery<Computer> query = em.createNamedQuery("select c from Computer c where c.name = :name", Computer.class);
        query.setParameter("name",name);
        return query.getResultList();
    }

    public List<Computer> deleteComputerByName(String name) {
        TypedQuery<Computer> query = em.createNamedQuery("select c from Computer c where c.name = :name", Computer.class);
        query.setParameter("name",name);
        return query.getResultList();
    }
}
