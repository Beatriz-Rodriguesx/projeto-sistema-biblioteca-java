package gui;

import java.util.Date;

import doc.Livro;
import doc.LivroDigital;
import doc.LivroFisico;
import org.Biblioteca;
import org.MembroBiblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new LivroFisico("Java Programming", "John Doe", "1234567890", "A1");
        Livro livro2 = new LivroDigital("Data Structures", "Jane Smith", "0987654321", "PDF");
        MembroBiblioteca membro1 = new MembroBiblioteca("Alice", 1001);
        MembroBiblioteca membro2 = new MembroBiblioteca("Bob", 1002);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.cadastrarMembro(membro1);
        biblioteca.cadastrarMembro(membro2);

        Date dataEmprestimo = new Date();
        Date dataDevolucao = new Date(dataEmprestimo.getTime() + 7 * 24 * 60 * 60 * 1000);
        biblioteca.fazerEmprestimo(membro1, livro1, dataEmprestimo, dataDevolucao);
        biblioteca.fazerEmprestimo(membro2, livro2, dataEmprestimo, dataDevolucao);

        biblioteca.fazerDevolucao(membro1, livro1);
        biblioteca.fazerDevolucao(membro2, livro2);
    }
}