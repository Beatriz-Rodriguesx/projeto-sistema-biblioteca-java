package gui;

public interface EmprestimoLivro {


    // realiza o empréstimo do livro
    void realizarEmprestimo();

    // devolução do livro
    void devolverLivro();

    // análise se o livro poder ser emprestado
    boolean podeSerEmprestado();

    // data de emprestimo do livro
    Date getDataEmprestimo();

    // data da devolução do livro
    Date getDataDevolução();

}