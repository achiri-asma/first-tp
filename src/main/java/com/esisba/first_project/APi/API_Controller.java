package com.esisba.first_project.APi;

import com.esisba.first_project.Entities.Client;
import com.esisba.first_project.Entities.Compte;
import com.esisba.first_project.repository.ClientRepository;
import com.esisba.first_project.repository.CompteRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("client_api")
public class API_Controller {

    @Resource //@Autowired
    ClientRepository clientrepository;
    @Resource
    CompteRepository compteRepository;
    @GetMapping("/client/all")
    List<Client> allClients(){
        return clientrepository.findAll();
    }
    @GetMapping("/client/{id}")
    public Client getClientById1(@PathVariable("id") Long idclient){
        return clientrepository.findById(idclient).get();
    }
    @GetMapping("/client")
    public Client getClientById2(@RequestParam("id") Long idclient){
        return clientrepository.findById(idclient).get();
    }
    @PostMapping("/client")
    public Client createNewClient(@RequestBody Client client){
        return  clientrepository.save(client);
    }

    @PostMapping("/compte")
    public Compte addCompte (@RequestBody CompteDTO cmpt){
        Compte compte=new Compte();
        compte.setLogin(cmpt.getLogin());
        compte.setPassword(cmpt.getPassword());
        compte.setDateCreation(new Date());
        Client client=clientrepository.findById(cmpt.getIdClient()).get();
        compte.setClient(client);
        return  compteRepository.save(compte);
    }
}
