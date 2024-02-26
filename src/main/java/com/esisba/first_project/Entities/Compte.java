package com.esisba.first_project.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompte;

    private String login;
    private String password;
    private Date dateCreation;
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnore
    private Client client;

}
