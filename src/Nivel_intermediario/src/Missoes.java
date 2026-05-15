public class Missoes {
    private String nome;
    private rankingDeMissoes rank;

    //metodo para mostrar mais informaçoes
    public void exibirDetalhes() {
        System.out.println("Missoes: " + rank + "\nNome: " + nome + "\n" + "Dificuldade: " + rank.getDificuldade() + "\n" + "Descrisao: " + rank.getDescricao());
    }

    public Missoes(rankingDeMissoes rank, String nome) {
        this.rank = rank;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public rankingDeMissoes getRank() {
        return rank;
    }

    public void setRank(rankingDeMissoes rank) {
        this.rank = rank;
    }

}
