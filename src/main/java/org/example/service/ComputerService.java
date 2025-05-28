package org.example.service;

import org.example.DAO.ComputerDAO;
import org.example.entity.Computer;
import org.example.entity.Identification;

public class ComputerService {

    private ComputerDAO computerDAO;

    public ComputerService() {
        this.computerDAO = new ComputerDAO();
    }

    public Computer create (String name, String number) {
        Computer computer = Computer.builder().name("Adresse Mac").build();
        Identification identification = Identification.builder().adressIdentification("ipAdress").build();
        return computerDAO.createComputer(computer);
    }
}
