package org;

import java.util.ArrayList;
import java.util.List;

import doc.Livro;

public class MembroBiblioteca {

    private String nome;
    private int id;
    private List<Livro> emprestimos;

    public MembroBiblioteca(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.emprestimos = new ArrayList<>();
    }

    public boolean fazerEmprestimo(Livro livro) {
        if (livro.getDisponivel()) {
            this.emprestimos.add(livro);
            livro.setDisponivel(false);
            System.out.println("Empréstimo realizado com sucesso!");
            return true;

        } else {
            System.out.println("Erro ao efetuar empréstimo!");
            return false;
            
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean fazerDevolucao(Livro livro) {
        if (this.emprestimos.contains(livro)) {
            this.emprestimos.remove(livro);
            livro.setDisponivel(true);
            System.out.println("Devolução realizada com sucesso!");
            return true;
        } else {
            System.out.println("Erro ao efetuar devolução!");
            return false;
        }
    }
}