package doc;

public abstract class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    // Construtor do Livro
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    // Metodo para livro emprestado com sucesso
    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        System.out.println("Não há exemplar disponível para empréstimo.");
        return false;
        // Se o livro não está disponível para empréstimo terá esse retorno
    }

    public void devolver() {
        disponivel = true; // Quando o livro é devolvido, fica disponível novamente
    }

    // Métodos abstratos que devem ser implementados nas subclasses
    public abstract String getTipo();

    // Getters e setters (métodos de acesso) para os campos privados
    public String getTitulo() {
        return titulo;
    }
    
    // Método que altera o dado informacional, quando for chamado *--*
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // Método que pega "retorna" o dado informacional, quando for chamado
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean obraDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


}
