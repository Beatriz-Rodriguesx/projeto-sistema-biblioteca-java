package org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import doc.Livro;
import gui.Emprestimo_Devolucao;

public class Biblioteca implements Emprestimo_Devolucao {

    private List<Livro> livros;
    private List<MembroBiblioteca> membros;
    private List<Emprestimo_Devolucao> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }

    public void cadastrarMembro(MembroBiblioteca membro) {
        this.membros.add(membro);
    }

    @Override
    public boolean fazerEmprestimo(MembroBiblioteca membro, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        if (!livro.isDisponivel()) {
            return false; // Livro indisponível para empréstimo
        }

        if (membro.fazerEmprestimo(livro)) {
            livro.setDisponivel(false);
            emprestimos.add(this);
            return true;
        }

        return false;
    }

    @Override
    public boolean fazerDevolucao(MembroBiblioteca membro, Livro livro) {
        if (membro.fazerDevolucao(livro)) {
            livro.setDisponivel(true);
            emprestimos.remove(this);
            return true;
        }

        return false;
    }
}