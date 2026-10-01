public class Main {

    public static void main(String[] args) {

        // Cadastro de livros
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Pequeno Principe", "Antoine de Saint-Exupery");

        // Cadastro de leitores
        Leitor aluno = new Leitor("Ana Souza", "2024001");
        Leitor professor = new Leitor("Carlos Silva", "P0017");

        // Emprestimo do livro 1 para a aluna
        System.out.println("== Emprestimo 1 ==");
        Emprestimo emprestimo1 = new Emprestimo(livro1, aluno, "01/10/2026");
        emprestimo1.exibirDetalhes();

        // Tentativa de emprestar o mesmo livro novamente (deve exibir aviso)
        System.out.println("== Tentativa de novo emprestimo do mesmo livro ==");
        Emprestimo emprestimo2 = new Emprestimo(livro1, professor, "02/10/2026");
        emprestimo2.exibirDetalhes();

        // Emprestimo do livro 2 para o professor
        System.out.println("== Emprestimo 2 ==");
        Emprestimo emprestimo3 = new Emprestimo(livro2, professor, "02/10/2026");
        emprestimo3.exibirDetalhes();

        // Devolucao do livro 1 e novo emprestimo
        System.out.println("== Devolucao do livro 1 ==");
        livro1.devolver();
        System.out.println("Livro \"" + livro1.getTitulo() + "\" disponivel: " + livro1.isDisponivel());

        System.out.println("== Novo emprestimo do livro 1 ==");
        Emprestimo emprestimo4 = new Emprestimo(livro1, aluno, "10/10/2026");
        emprestimo4.exibirDetalhes();

        // Situacao final dos livros
        System.out.println("== Situacao dos livros ==");
        System.out.println(livro1.getTitulo() + " - disponivel: " + livro1.isDisponivel());
        System.out.println(livro2.getTitulo() + " - disponivel: " + livro2.isDisponivel());
    }
}
