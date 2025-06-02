package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

//    @OneToOne
//    @JoinColumn(name = "idComputer")
//    private Identification identificationComputer;


    @ManyToMany
    @JoinTable(name = "project_computer",
    joinColumns = @JoinColumn(name = "computerId"),
    inverseJoinColumns = @JoinColumn(name = "computerId"))

    private List<Computer> computers;
}
