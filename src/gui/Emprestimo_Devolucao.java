package gui;

import java.util.Date;

import doc.Livro;
import org.MembroBiblioteca;

public interface Emprestimo_Devolucao {

    boolean fazerEmprestimo(MembroBiblioteca membro, Livro livro, Date dataEmprestimo, Date dataDevolucao);

    boolean fazerDevolucao(MembroBiblioteca membro, Livro livro);

}