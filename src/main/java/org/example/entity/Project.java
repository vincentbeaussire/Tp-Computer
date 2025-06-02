package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Project {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "projects")
    private List<Computer> computers;

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", computers=" + computers +
                '}';
    }
}
