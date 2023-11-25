package gui;

import java.util.ArrayList;
import java.util.List;

public class MembroBiblioteca implements EmprestimoLivro {

    private String nome;
    private int id;
    private boolean podeEmprestar;
    private List<Emprestimo> emprestimos;

 public MembroBiblioteca(String nome, int id) {
        this.nome = nome;
        this.id = id;
    // o membro da biblioteca pode emprestar o livro inicialmente;
        this.podeEmprestar = true; 
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

  
}
