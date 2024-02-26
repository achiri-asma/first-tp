package com.esisba.first_project;

import com.esisba.first_project.Entities.Civility;
import com.esisba.first_project.Entities.Client;
import com.esisba.first_project.Entities.Compte;
import com.esisba.first_project.repository.ClientRepository;
import com.esisba.first_project.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    CompteRepository compteRepository;
    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Client client1=new Client(null,"Asma","a.achiri@esi-sba.dz", Civility.Femme,null);
        Client client2=new Client(null,"Samya","s.achiri@esi-sba.dz", Civility.Femme,null);
        clientRepository.save(client1);
        clientRepository.save(client2);
        Client c=clientRepository.findById(2L).get();
        Compte comptt=new Compte(null,"jj","pp",new Date(),c);
        compteRepository.save(comptt);
        clientRepository.findClientsByNom("Samya").forEach(System.out::println);
        System.out.println(clientRepository.findNameById(2L));
    }
}
