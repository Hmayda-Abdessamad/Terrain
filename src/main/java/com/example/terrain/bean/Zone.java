package com.example.terrain.bean;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Zone {
    @Id
    private int id;
    @Column
    private String nom;
    @OneToMany(mappedBy="zone")
    private Set<Terrain> terrains;

    @ManyToOne
    @JoinColumn(name="ville_id", nullable=false)
    private Ville ville;
}
