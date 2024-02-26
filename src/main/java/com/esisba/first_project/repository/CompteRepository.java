package com.esisba.first_project.repository;

import com.esisba.first_project.Entities.Client;
import com.esisba.first_project.Entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
}
