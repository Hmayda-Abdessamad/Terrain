package com.example.terrain.bean;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Terrain {
    @Id
    private int id;
    @Column
    private String nom;
    @Column
    private String adresse;
    @Column
    private double latitude;
    @Column
    private double longitude;
    @Column
    private int rank;
    @Column
    private String type;
    @Column
    private String etat;
    @Column
    private String description;
    @Column
    private String typeSal;
    @Column
    private double tarif;

    @OneToMany(mappedBy="terrain",cascade = CascadeType.ALL)
    private Set<Photo> photos;

    @ManyToOne
    @JoinColumn(name="zone_id", nullable=false)
    private Zone zone;

    @ManyToOne
    @JoinColumn(name="club_id", nullable=false)
    private Club club;
}
