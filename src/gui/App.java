package gui;

import java.util.Date;

import doc.Livro;
import doc.LivroDigital;
import doc.LivroFisico;
import org.Biblioteca;
import org.MembroBiblioteca;
import org.Usuario;

public class App {
    public static void main(String[] args) {
        
        //Cria Livro
        
        Livro livro1 = new LivroFisico("Harry Potter", "J.K", "1234567890", "A1");
        Livro livro2 = new LivroDigital("Orgulho e Preconceito", "Jane A", "0987654321", "PDF");
        
        //Cria Membros da Biblioteca 
        
        MembroBiblioteca membro1 = new MembroBiblioteca("Alice", 1001);
        MembroBiblioteca membro2 = new MembroBiblioteca("Bob", 1002);

        // Criando usuários
        
        Usuario usuario1 = new Usuario("Ana Beatriz", "membro1@");
        Usuario usuario2 = new Usuario("Guilherme", "123@Mudar");
        
        //Define as datas de Emprestimo e devolução
        
        Date dataEmprestimo = new Date();
        Date dataDevolucao = new Date(dataEmprestimo.getTime() + 7 * 24 * 60 * 60 * 1000);
        
        //Atribuição de metodos *Caracteristicas*
        Biblioteca biblioteca = new Biblioteca(); //Cria objeto Biblioteca
        
        biblioteca.cadastrarMembro(membro1);
        biblioteca.cadastrarMembro(membro2);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.removerLivro(livro1);
        biblioteca.removerLivro(livro2);
        
        biblioteca.fazerEmprestimo(membro1, livro1, dataEmprestimo, dataDevolucao);
        biblioteca.fazerEmprestimo(membro2, livro2, dataEmprestimo, dataDevolucao);

        biblioteca.fazerDevolucao(membro1, livro1);
        biblioteca.fazerDevolucao(membro2, livro2);


        // Monstrando os livros e membros cadastrados

         System.out.println("\nMembro cadastrado:\n\n" + membro1.getNome() + " Matrícula : " + membro1.getId() + ")");
         System.out.println( membro2.getNome() + " Matrícula : " + membro2.getId() + ")");
         
         System.out.println("\nLivro adicionado:\n " + livro1.getTitulo() + " Matrícula : " + livro1.getIsbn() + ")");
         System.out.println("\nLivro adicionado:\n " + livro2.getTitulo() + " Matrícula : " + livro2.getIsbn() + ")");

        // Remoção de livros cadastrados

        System.out.println("Livro removido: " + livro1.getTitulo() + " (ID: " + livro1.getIsbn() + ")");
        System.out.println("Livro removido: " + livro2.getTitulo() + " (ID: " + livro2.getIsbn() + ")");

    
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