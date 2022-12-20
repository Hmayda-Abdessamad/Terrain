package com.example.terrain.bean;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Pack {
    @Id
    private int id;
    @Column
    private String nom;
    @Column
    private double tarif;
    @Column
    private int nbrDeMatches;

    @ManyToOne
    @JoinColumn(name="club_id", nullable=false)
    private Club club;

}
