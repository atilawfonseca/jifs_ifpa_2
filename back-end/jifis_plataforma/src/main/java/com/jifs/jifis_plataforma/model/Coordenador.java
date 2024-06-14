package com.jifs.jifis_plataforma.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "coordenadores")
public class Coordenador {
    
    @Id
    @Column(nullable = false, unique = true)
    @Size(min = 7, max = 7, message = "O SIAPE deve conter 7 digitos") 
    private String siape;

    @NotBlank(message = "O nome de usuário é obrigatório")
    @Size(min = 3, max = 50)
    private String nome;

    @Email(message = "O e-mail deve ser válido")
    @NotBlank(message = "O email é obrigatório")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 8, message = "A senha deve conter no minimo 8 digitos")
    private String senha;

    @NotBlank(message = "O telefone é obrigatório")
    @Column(nullable = false, unique = true)
    private String telefone;

    public Coordenador(){

    }

    public Coordenador(String siape, String nome, String email,String senha, String telefone){
        this.siape = siape;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

 
}
