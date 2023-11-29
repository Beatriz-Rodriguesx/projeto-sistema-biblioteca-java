package doc;

public class LivroDigital extends Livro {
    private String formato;

    public LivroDigital(String titulo, String autor, String isbn, String formato) {
        super(titulo, autor, isbn);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String getTipo() {
        return "Livro Digital";
    }
}