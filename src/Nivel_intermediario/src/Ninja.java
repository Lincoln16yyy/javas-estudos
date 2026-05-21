// Arquivo: Ninja.java

public class Ninja {
    public String nome;
    public int idade;
    public String vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Vila: " + vila;
    }
}