package com.example.tein8.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Voz {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @Column(name= "Nome")
    private String nome;

    @Column(name= "CNPJ")
    private String cnpj;

    @Column(name= "Descricao")
    private String descricao;

    @Column(name= "Data Cadastro")
    private String data;

     public Empresa() {
    }

    public Empresa(String nome) {
        this.nome = nome;
    }

    public Empresa(Long id, String nome, String cnpj, String descricao, String data) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.descricao = descricao;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Empresa [id=" + id + ", Nome=" + nome + ", CNPJ=" + cnpj + ", Descricao=" + descricao + ", Data Cadastro=" + data + "]";
    }
}