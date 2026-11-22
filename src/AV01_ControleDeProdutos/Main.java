public class Main {

    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 101, 80.00, 10);
        Produto mouse = new Produto("Mouse", 102, 45.90, 7);

        System.out.println("--- CONTROLE DE PRODUTOS ---");
        teclado.exibirInformacoes();
        System.out.println();
        mouse.exibirInformacoes();
        System.out.println();

        System.out.println("Adicionando 5 unidades ao teclado...");
        teclado.adicionarEstoque(5);
        System.out.println("Estoque atual: " + teclado.getQuantidade());
        System.out.println();

        System.out.println("Removendo 3 unidades do teclado...");
        teclado.removerEstoque(3);
        System.out.println("Estoque atual: " + teclado.getQuantidade());
        System.out.println();

        System.out.println("Removendo 20 unidades do mouse...");
        if (mouse.removerEstoque(20)) {
            System.out.println("Estoque atual: " + mouse.getQuantidade());
        } else {
            System.out.println("Estoque insuficiente. Estoque atual: " + mouse.getQuantidade());
        }
    }
}
