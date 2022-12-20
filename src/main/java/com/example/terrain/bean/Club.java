package com.example.terrain.bean;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Club {
    @Id
    private int id;
    @Column
    private String nom;

    @OneToMany(mappedBy="club",cascade = CascadeType.ALL)
    private Set<Terrain> terrains;

    @OneToMany(mappedBy="club",cascade = CascadeType.ALL)
    private Set<Pack> packs;


}
