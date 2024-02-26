package com.esisba.first_project.repository;

import com.esisba.first_project.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findClientsByNom(String n);

    @Query("select e.nom from Client e where e.idClient = :id")
    String findNameById(@Param("id") Long id);
}
