package gui;

import java.util.Date;

import doc.Livro;
import org.Biblioteca;
import org.MembroBiblioteca;

public class Usuario {
    private Biblioteca biblioteca;
    private MembroBiblioteca membro;

    public Usuario(Biblioteca biblioteca, MembroBiblioteca membro) {
        this.biblioteca = biblioteca;
        this.membro = membro;
    }

    public boolean fazerEmprestimo(Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        return biblioteca.fazerEmprestimo(membro, livro, dataEmprestimo, dataDevolucao);
    }

    public boolean fazerDevolucao(Livro livro) {
        return biblioteca.fazerDevolucao(membro, livro);
    }
}