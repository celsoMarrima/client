package com.devmarrima.client.dto;

import java.time.LocalDate;

import com.devmarrima.client.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public class ClientDTO {
    private Long id;
    @Size(min = 3, max = 50, message = "O campo tem que ter de três a cem caracteres" )
    @NotBlank(message = " Não pode ser vazio.")
    private String name;

    private String cpf;
    private Double income;

    @PastOrPresent(message = "A data de nascimento deve estar no passado ou ser a data atual.")
    private LocalDate birthDate;
    
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    
    

}
