public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (!disponivel) {
            System.out.println("Aviso: o livro \"" + titulo + "\" já está emprestado!");
        } else {
            disponivel = false;
        }
    }

    public void devolver() {
        disponivel = true;
    }
}
