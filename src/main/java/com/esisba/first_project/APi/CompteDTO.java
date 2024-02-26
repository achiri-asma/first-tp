package com.esisba.first_project.APi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor @NoArgsConstructor
public class CompteDTO {
    private String Login;
    private String password ;
    private Long idClient;
}
