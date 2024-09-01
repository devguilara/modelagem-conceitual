package dev.guilara.cursomc.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;


    @ManyToMany //Mapeamento de referencia de modelagem do banco * - *
    @JoinTable(
            name = "Join_Produto_Categoria",
            joinColumns = @JoinColumn(name = "prodId"),
            inverseJoinColumns = @JoinColumn(name = "catId")

    ) //definir a table q faz o manytomany na tabela
    private List<Categoria> categorias = new ArrayList<>();

    public Produto() {}

    public Produto(String nome, String descricao, double preco) {

        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;

    }
    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
