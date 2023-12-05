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

         // Criando usuários
         Usuario usuario1 = new Usuario(biblioteca, membro1);
         Usuario usuario2 = new Usuario(biblioteca, membro2);

        // Monstrando os livros e membros cadastrados
         System.out.println("Membro cadastrado: " + membro1.getNome() + " (ID: " + membro1.getId() + ")");
         System.out.println("Membro cadastrado: " + membro2.getNome() + " (ID: " + membro2.getId() + ")");
         
         System.out.println("Livro adicionado: " + livro1.getTitulo() + " (ID: " + livro1.getCodigoISBN() + ")");
         System.out.println("Livro adicionado: " + livro2.getTitulo() + " (ID: " + livro2.getCodigoISBN() + ")");
    
          // Fazendo empréstimos
        if (usuario1.fazerEmprestimo(livro1, dataEmprestimo, dataDevolucao)) {
            System.out.println("Empréstimo de " + livro1.getTitulo() + " para " + membro1.getNome() +
                    " realizado com sucesso em " + dataEmprestimo + " com devolução até " + dataDevolucao + ".");
        } else {
            System.out.println("Falha ao realizar o empréstimo de " + livro1.getTitulo() + " para " + membro1.getNome() + ".");
        }

        if (usuario2.fazerEmprestimo(livro2, dataEmprestimo, dataDevolucao)) {
            System.out.println("Empréstimo de " + livro2.getTitulo() + " para " + membro2.getNome() +
                    " realizado com sucesso em " + dataEmprestimo + " com devolução até " + dataDevolucao + ".");
        } else {
            System.out.println("Falha ao realizar o empréstimo de " + livro2.getTitulo() + " para " + membro2.getNome() + ".");
        }

        // Fazendo devoluções
        if (usuario1.fazerDevolucao(livro1)) {
            System.out.println("Devolução de " + livro1.getTitulo() + " feita por " + membro1.getNome() +
                    " realizada com sucesso em " + new Date() + ".");
        } else {
            System.out.println("Falha ao realizar a devolução de " + livro1.getTitulo() + " feita por " + membro1.getNome() + ".");
        }

        if (usuario2.fazerDevolucao(livro2)) {
            System.out.println("Devolução de " + livro2.getTitulo() + " feita por " + membro2.getNome() +
                    " realizada com sucesso em " + new Date() + ".");
        } else {
            System.out.println("Falha ao realizar a devolução de " + livro2.getTitulo() + " feita por " + membro2.getNome() + ".");
        }
    }
}