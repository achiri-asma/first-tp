package com.esisba.first_project.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="pr",types=Compte.class)
public interface CompteProjection {
    public Long getIdCompte();
    public String getLogin();
    @Value("#{target.client.email}") // on utilise de spring boot
    public String getEmail();

}
