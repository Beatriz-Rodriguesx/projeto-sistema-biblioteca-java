package org;

import doc.Livro;
import gui.EmprestimoLivro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements EmprestimoLivro {

    private List<Livro> livros;
    private List<MembroBiblioteca> membros;
    private List<EmprestimoLivro> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        // Lógica para adicionar livro à biblioteca
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        // Lógica para remover livro da biblioteca
        this.livros.remove(livro);
    }

    public void cadastrarMembro(MembroBiblioteca membro) {
        // Lógica para cadastrar membro na biblioteca
        this.membros.add(membro);
    }

    @Override
    public boolean fazerEmprestimo(MembroBiblioteca membro, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        // Lógica para fazer empréstimo na biblioteca
        if (membro.fazerEmprestimo(livro)) {
            // Adiciona o empréstimo à lista de empréstimos da biblioteca
            // Usar a dataEmprestimo e dataDevolucao
            this.emprestimos.add(this);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean fazerDevolucao(MembroBiblioteca membro, Livro livro) {
        // Lógica para fazer devolução na biblioteca
        if (membro.fazerDevolucao(livro)) {
            // Remove o empréstimo da lista de empréstimos da biblioteca
            this.emprestimos.remove(this);
            return true;
        } else {
            return false;
        }
    }

    // Getters e Setters aqui né Yas?
}
