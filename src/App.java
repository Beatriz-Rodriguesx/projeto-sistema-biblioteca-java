
// import doc.Livro; **Importar se tiver necessidade**
import doc.LivroDigital;
import doc.LivroFisico;

public class App {
    public static void main(String[] args) {
        
        // **Aqui foi chamado o costrutor para inicializar o objeto LivroFisico*
        LivroFisico livroFisico1 = new LivroFisico("Harry Potter", "J.R.R. Tolkien", "9788532530783", "Biblioteca A");
        LivroFisico livroFisico2 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", "9786555114249", "Biblioteca A");
        LivroFisico livroFisico3 = new LivroFisico("Orgulho e Preconceito", "Jane Austen", "9786550970437", "Biblioteca A");
        

        // **Aqui será chamado os métodos da classe LivroFisico para criar o objeto e atribuir suas características**

        System.out.println("\nLivro do Acervo de Ficção da Biblioteca **A**:\n");

        System.out.println("\n**001**Título: " + livroFisico1.getTitulo());
        System.out.println("Autor: " + livroFisico1.getAutor());
        System.out.println("ISBN: " + livroFisico1.getIsbn());
        System.out.println("Localização: " + livroFisico1.getLocalizacao());
        System.out.println("Tipo: " + livroFisico1.getTipo());
        livroFisico1.emprestar();
        System.out.println("Após empréstimo, disponível? " + livroFisico1.obraDisponivel());
        livroFisico1.devolver();
        System.out.println("Após devolução, disponível? " + livroFisico1.obraDisponivel());
        System.out.println();

        System.out.println("\n**002**Título: " + livroFisico2.getTitulo());
        System.out.println("Autor: " + livroFisico2.getAutor());
        System.out.println("ISBN: " + livroFisico2.getIsbn());
        System.out.println("Localização: " + livroFisico2.getLocalizacao());
        System.out.println("Tipo: " + livroFisico2.getTipo());
        livroFisico2.emprestar();
        System.out.println("Após empréstimo, disponível? " + livroFisico2.obraDisponivel());
        livroFisico2.devolver();
        System.out.println("Após devolução, disponível? " + livroFisico2.obraDisponivel());
        System.out.println();

        System.out.println("\nLivro do Acervo de Romance da Biblioteca **A**:\n");

        System.out.println("\n**001**Título: " + livroFisico3.getTitulo());
        System.out.println("Autor: " + livroFisico3.getAutor());
        System.out.println("ISBN: " + livroFisico3.getIsbn());
        System.out.println("Localização: " + livroFisico3.getLocalizacao());
        System.out.println("Tipo: " + livroFisico3.getTipo());
        livroFisico3.emprestar();
        System.out.println("Após empréstimo, disponível? " + livroFisico3.obraDisponivel());
        livroFisico3.devolver();
        System.out.println("Após devolução, disponível? " + livroFisico3.obraDisponivel());
        System.out.println();

        // **Aqui foi chamado o costrutor para inicializar o objeto LivroDigital**
        LivroDigital livroDigital1 = new LivroDigital("Introdução à Inteligência Artificial", "Seu Autor", "9781234567890", "PDF");

        // **Aqui será chamado os métodos da classe LivroDigital para criar o objeto e atribuir suas características**
        System.out.println("\nLivro Digital do Repositorio Institucional SIG@:\n");
        System.out.println("\nTítulo: " + livroDigital1.getTitulo());
        System.out.println("Autor: " + livroDigital1.getAutor());
        System.out.println("ISBN: " + livroDigital1.getIsbn());
        System.out.println("Formato: " + livroDigital1.getFormato());
        System.out.println("Tipo: " + livroDigital1.getTipo());
        livroDigital1.emprestar();
        System.out.println("Após empréstimo, disponível? " + livroDigital1.obraDisponivel());
        livroDigital1.devolver();
        System.out.println("Após devolução, disponível? " + livroDigital1.obraDisponivel());
    }
}