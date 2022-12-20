package com.example.terrain.bean;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Ville {
    @Id
    private int id;
    @Column
    private String ville;
    @OneToMany(mappedBy="ville",cascade = CascadeType.ALL)
    private Set<Zone> zones;
}
