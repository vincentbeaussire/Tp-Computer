package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Identification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComputer;

    private String adressIdentification;

    @OneToOne(mappedBy = "identificationComputer")
    private Computer computer;

    public Identification(String s) {
    }

    @Override
    public String toString() {
        return "Identification{" +
                "idComputer=" + idComputer +
                ", adressIdentification='" + adressIdentification + '\'' +
                ", computer=" + computer +
                '}';
    }
}
