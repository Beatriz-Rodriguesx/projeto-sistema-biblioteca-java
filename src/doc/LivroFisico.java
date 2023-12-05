package doc;

public class LivroFisico extends Livro {

    private String localizacao;

    public LivroFisico(String titulo, String autor, String isbn, String localizacao) {
        super(titulo, autor, isbn);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String getTipo() {
        return "Físico";
    }
}