package com.jifs.jifis_plataforma.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "coordenadores")
public class Coordenadores {
    
    @Id
    @Column(nullable = false, unique = true)
    @Size(min = 7, max = 7, message = "O SIAPE deve conter 7 digitos") 
    private Long siape;

    @NotBlank(message = "O nome de usuário é obrigatório")
    @Size(min = 3, max = 50)
    private String nome;

    @Email(message = "O e-mail deve ser válido")
    @NotBlank(message = "O email é obrigatório")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "O telefone é obrigatório")
    @Column(nullable = false, unique = true)
    private String telefone;

    public Coordenadores(){

    }

    public Coordenadores(Long siape, String nome, String email, String telefone){
        this.siape = siape;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {
        return siape;
    }

    public void setId(Long id) {
        this.siape = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

}
