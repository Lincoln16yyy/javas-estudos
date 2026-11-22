import java.util.Locale;

/**
 * Representa um produto do estoque de uma pequena loja.
 *
 * Todos os atributos são privados (encapsulamento) e só podem ser lidos ou
 * alterados pelos getters e setters. Os setters validam os valores recebidos
 * e recusam dados inválidos (nome vazio, código menor ou igual a zero, preço
 * negativo e quantidade negativa).
 */
public class Produto {

    private static final Locale PT_BR = Locale.forLanguageTag("pt-BR");

    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    /**
     * Cria um produto já validando todos os dados informados.
     */
    public Produto(String nome, int codigo, double preco, int quantidade) {
        setNome(nome);
        setCodigo(codigo);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    // ---------------------------------------------------------------
    // Getters
    // ---------------------------------------------------------------

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

    // ---------------------------------------------------------------
    // Setters com validação
    // Cada setter retorna true quando o valor foi aceito e false quando
    // foi recusado, sem alterar o valor anterior do atributo.
    // ---------------------------------------------------------------

    public boolean setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return false;
        }
        this.nome = nome.trim();
        return true;
    }

    public boolean setCodigo(int codigo) {
        if (codigo <= 0) {
            return false;
        }
        this.codigo = codigo;
        return true;
    }

    public boolean setPreco(double preco) {
        if (preco < 0) {
            return false;
        }
        this.preco = preco;
        return true;
    }

    public boolean setQuantidade(int quantidade) {
        if (quantidade < 0) {
            return false;
        }
        this.quantidade = quantidade;
        return true;
    }

    // ---------------------------------------------------------------
    // Operações de estoque
    // ---------------------------------------------------------------

    /**
     * Adiciona unidades ao estoque.
     *
     * @param quantidade quantidade a adicionar (deve ser maior que zero)
     * @return true se o estoque foi atualizado, false caso contrário
     */
    public boolean adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            return false;
        }
        this.quantidade += quantidade;
        return true;
    }

    /**
     * Remove unidades do estoque. A remoção só acontece quando existe
     * quantidade suficiente disponível.
     *
     * @param quantidade quantidade a remover (deve ser maior que zero)
     * @return true se o estoque foi atualizado, false caso contrário
     */
    public boolean removerEstoque(int quantidade) {
        if (quantidade <= 0 || quantidade > this.quantidade) {
            return false;
        }
        this.quantidade -= quantidade;
        return true;
    }

    // ---------------------------------------------------------------
    // Exibição
    // ---------------------------------------------------------------

    /**
     * Exibe no console os dados do produto.
     */
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf(PT_BR, "Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade: " + quantidade);
    }

    @Override
    public String toString() {
        return String.format(PT_BR, "Produto{nome='%s', codigo=%d, preco=R$ %.2f, quantidade=%d}",
                nome, codigo, preco, quantidade);
    }
}
