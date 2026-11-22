public class Produto {

    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Código inválido.");
        }
        setNome(nome);
        this.codigo = codigo;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public boolean adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            return false;
        }
        this.quantidade += quantidade;
        return true;
    }

    public boolean removerEstoque(int quantidade) {
        if (quantidade <= 0 || quantidade > this.quantidade) {
            return false;
        }
        this.quantidade -= quantidade;
        return true;
    }
}
