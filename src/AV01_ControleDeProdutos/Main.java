import java.util.Locale;

/**
 * Classe principal da Atividade Avaliativa I - Controle de Produtos.
 *
 * Cria dois objetos Produto, exibe suas informações e testa as operações
 * de adicionar e remover estoque, além das validações dos setters.
 */
public class Main {

    private static final Locale PT_BR = Locale.forLanguageTag("pt-BR");

    public static void main(String[] args) {
        System.out.println("--- CONTROLE DE PRODUTOS ---");

        // -----------------------------------------------------------
        // 1. Instanciação de dois produtos
        // -----------------------------------------------------------
        Produto teclado = new Produto("Teclado", 101, 80.00, 10);
        Produto mouse = new Produto("Mouse", 102, 45.90, 7);

        teclado.exibirInformacoes();
        System.out.println();
        mouse.exibirInformacoes();
        System.out.println();

        // -----------------------------------------------------------
        // 2. Operações de estoque com o teclado
        // -----------------------------------------------------------
        System.out.println("Adicionando 5 unidades...");
        if (teclado.adicionarEstoque(5)) {
            System.out.println("Estoque atual: " + teclado.getQuantidade());
        }
        System.out.println();

        System.out.println("Removendo 3 unidades...");
        if (teclado.removerEstoque(3)) {
            System.out.println("Estoque atual: " + teclado.getQuantidade());
        }
        System.out.println();

        // -----------------------------------------------------------
        // 3. Tentativa de remoção maior que o estoque disponível
        // -----------------------------------------------------------
        System.out.println("Tentando remover 50 unidades do mouse (estoque: "
                + mouse.getQuantidade() + ")...");
        if (!mouse.removerEstoque(50)) {
            System.out.println("Operação recusada: estoque insuficiente.");
            System.out.println("Estoque atual: " + mouse.getQuantidade());
        }
        System.out.println();

        // -----------------------------------------------------------
        // 4. Validações dos setters
        // -----------------------------------------------------------
        System.out.println("--- TESTES DE VALIDAÇÃO ---");

        System.out.println("Tentando definir preço negativo (-10.00)...");
        if (!mouse.setPreco(-10.00)) {
            System.out.println("Valor recusado. Preço continua: R$ "
                    + String.format(PT_BR, "%.2f", mouse.getPreco()));
        }

        System.out.println("Tentando definir quantidade negativa (-5)...");
        if (!mouse.setQuantidade(-5)) {
            System.out.println("Valor recusado. Quantidade continua: " + mouse.getQuantidade());
        }

        System.out.println("Tentando definir código inválido (0)...");
        if (!mouse.setCodigo(0)) {
            System.out.println("Valor recusado. Código continua: " + mouse.getCodigo());
        }

        System.out.println("Tentando definir nome vazio...");
        if (!mouse.setNome("   ")) {
            System.out.println("Valor recusado. Nome continua: " + mouse.getNome());
        }
        System.out.println();

        // -----------------------------------------------------------
        // 5. Atualização válida e exibição final
        // -----------------------------------------------------------
        System.out.println("Atualizando o preço do mouse para R$ 49,90...");
        mouse.setPreco(49.90);
        System.out.println();

        System.out.println("--- ESTADO FINAL ---");
        teclado.exibirInformacoes();
        System.out.println();
        mouse.exibirInformacoes();
    }
}
