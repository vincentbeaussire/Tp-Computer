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
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProcessor;

    private String processorName;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "name")
    private Computer computer;
}
