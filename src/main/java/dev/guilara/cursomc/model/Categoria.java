package dev.guilara.cursomc.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
//Classe convertida em implementação de Serializable para que possa ser convertida para uma sequencia de bytes
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    private String nome;

    public Categoria(){
        //Construtor
    }

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    //HashCode Equals -> operações para comparar o valor nao pelo ponteiro de memória

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
