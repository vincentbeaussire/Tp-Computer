package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperatingSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOperatingSystem;

    private String operatingSystemName;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "name")

    private Computer computer;
}
