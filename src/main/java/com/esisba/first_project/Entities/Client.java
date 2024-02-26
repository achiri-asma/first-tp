package com.esisba.first_project.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idClient;

    @Column(nullable = false,length=25)
    private String nom;

    @Column(unique=true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Civility sexe;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private Collection<Compte> Lescomptes;
}
