package gui;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import doc.Livro;
import doc.LivroDigital;
import doc.LivroFisico;
import org.Biblioteca;
import org.MembroBiblioteca;
import org.Usuario;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Cria livros
        Livro livro1 = new LivroFisico("Harry Potter", "J.K. Rowling", "1234567890", "A1");
        Livro livro2 = new LivroFisico("Orgulho e Preconceito", "Jane Austin", "0987654321", "A2");
        Livro livro3 = new LivroFisico("O Hobbit", "J.R.R.Tolkien", "4352667857", "A1");
        Livro livro4 = new LivroDigital("Torto Arado", "Itamar Junior", "5546372891", "PDF");
        Livro livro5 = new LivroDigital("A Garota do Lago", "Charlie Donlea", "6573887546", "PDF");

        // Cria membros da Biblioteca
        MembroBiblioteca membro1 = new MembroBiblioteca("Alice", 1001);
        MembroBiblioteca membro2 = new MembroBiblioteca("Bob", 1002);
        MembroBiblioteca membro3 = new MembroBiblioteca("Fernando", 1003);

        // Cria Usuários
        Usuario usuario1 = new Usuario("Ana Beatriz", "Membro1@");
        Usuario usuario2 = new Usuario("Camila", "Biblio@8");
        Usuario usuario3 = new Usuario("Carlos", "Mudar@87");

        // Define as datas de empréstimo e devolução
        Date dataEmprestimo = new Date();
        Date dataDevolucao = new Date(dataEmprestimo.getTime() + 7 * 24 * 60 * 60 * 1000);

        // Inserção de dados na biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.cadastrarMembro(membro1);
        biblioteca.cadastrarMembro(membro2);
        biblioteca.cadastrarMembro(membro3);
        biblioteca.UsuarioBiblioteca(usuario1);
        biblioteca.UsuarioBiblioteca(usuario2);
        biblioteca.UsuarioBiblioteca(usuario3);

        System.out.println("\nDeseja realizar um empréstimo? (true/false): ");
        boolean emprestar = scanner.nextBoolean();

        List<Livro> livrosDisponiveis = biblioteca.getLivrosDisponiveis();
        if (emprestar) {
            for (Livro livro : livrosDisponiveis) {
                System.out.println(livro.getTitulo());
            }

            scanner.nextLine();
            System.out.println("\nEscolha o livro pelo título: ");
            String tituloEscolhido = scanner.nextLine();

            Livro livroEscolhido = null;
            for (Livro livro : livrosDisponiveis) {
                if (livro.getTitulo().equalsIgnoreCase(tituloEscolhido)) {
                    livroEscolhido = livro;
                    break;
                }
            }

            if (livroEscolhido != null) {
                System.out.println(
                        "\nDeseja realizar o empréstimo do livro '" + livroEscolhido.getTitulo() + "'? (true/false)");
                boolean confirmarEmprestimo = scanner.nextBoolean();

                if (confirmarEmprestimo) {
                    boolean emprestimoRealizado = biblioteca.fazerEmprestimo(membro1, livroEscolhido, dataEmprestimo,
                            dataDevolucao);

                    if (emprestimoRealizado) {
                        System.out.println("Empréstimo realizado com sucesso!");
                    }
                } 
                
                else {
                    System.out.println("Empréstimo cancelado.");
                }
            } 

            else {
                System.out.println("Livro não encontrado na biblioteca.");
            }
        }

    }
}
