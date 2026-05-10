public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages() {
        //construtor sem argumentos


    }
    public Hokages(String nome) {
        this.nome = nome;
    }
    public Hokages(int idade) {
        this.idade = idade;
    }

    //all argus constructor
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }


}

void main() {
}
