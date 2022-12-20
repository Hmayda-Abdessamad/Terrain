package com.example.terrain.bean;

import jakarta.persistence.*;

@Entity
public class Photo {
    @Id
    private int id;
    @Column
    private String url;
    @ManyToOne
    @JoinColumn(name="terrain_id", nullable=false)
    private Terrain terrain;
}
