package com.br.biblioteca.model;

import javax.persistence.*;

@Entity
@Table(name = "livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ISBN;
    private String titulo;
    private int ano;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Editora editora;

    public Livro() {
    }

    public Livro(String titulo, int ano, long ISBN, Categoria categoria, Editora editora) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
        this.editora = editora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", categoria=" + categoria +
                ", editora=" + editora +
                '}';
    }
}
