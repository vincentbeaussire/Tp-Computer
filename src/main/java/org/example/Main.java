package org.example;

import org.example.entity.Computer;
import org.example.entity.Identification;
import org.example.service.ComputerService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ComputerService computerService = new ComputerService();

        computerService.create("macAdress", "0123456789");

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
//        EntityManager em = emf.createEntityManager();
//
//
//        Computer computer = Computer.builder().name("Adresse Mac").build();
//        Identification identification = Identification.builder().adressIdentification("ipAdress").build();
//
//        em.getTransaction().begin();
//        em.persist(computer);
//        em.persist(identification);
//        em.getTransaction().commit();
//
//        System.out.println(em.find(Computer.class, 1));

//        Computer computerfind = em.find(Computer.class, 1);
//        if (computerfind != null) {
//            System.out.println(computerfind);
//        } else {
//            System.out.println("No Computer found");
//        }
//
//        try {
//            Computer computerfindByReference = em.getReference(Computer.class, 1);
//            System.out.println(computerfindByReference);
//        } catch (EntityNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        try {
//            Computer computerToUpdate = em.getReference(Computer.class, 1);
//            em.getTransaction().begin();
//            computerToUpdate.setIdentificationComputer(identification);
//            em.getTransaction().commit();
//        } catch (EntityNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(em.find(Computer.class, 1));
//
//        Computer computerToDelete = em.find(Computer.class, 1);
//        if (computerToDelete != null) {
//            em.getTransaction().begin();
//            em.refresh(computerToDelete);
//            em.getTransaction().commit();
//        }
    }
}