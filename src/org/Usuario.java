package org;

import java.util.Date;

import doc.Livro;

public class Usuario {
    private Biblioteca biblioteca;
    private MembroBiblioteca membro;
    private String nomeUsuario;
    private String senha;

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
    /*public Usuario(Biblioteca biblioteca, MembroBiblioteca membro) {
        this.biblioteca = biblioteca;
        this.membro = membro;
        
    }*/
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public boolean fazerEmprestimo(Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        return biblioteca.fazerEmprestimo(membro, livro, dataEmprestimo, dataDevolucao);
    }

    public boolean fazerDevolucao(Livro livro) {
        return biblioteca.fazerDevolucao(membro, livro);
    }

    /*public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public MembroBiblioteca getMembro() {
        return membro;
    }

    public void setMembro(MembroBiblioteca membro) {
        this.membro = membro;
    }*/
}
