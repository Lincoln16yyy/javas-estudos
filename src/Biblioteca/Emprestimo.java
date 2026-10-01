public class Emprestimo {

    private Livro livro;
    private Leitor leitor;
    private String dataEmprestimo;

    public Emprestimo(Livro livro, Leitor leitor, String dataEmprestimo) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = dataEmprestimo;
        this.livro.emprestar();
    }

    public Livro getLivro() {
        return livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void exibirDetalhes() {
        System.out.println("------------ Emprestimo ------------");
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("Livro:  " + livro.getTitulo());
        System.out.println("Data:   " + dataEmprestimo);
        System.out.println("------------------------------------");
    }
}
