// Arquivo: Main.java

public class Main {
    public static void main(String[] args) {
        // Instanciando o gerenciador que criamos no outro arquivo
        GerenciadorNinjas sistema = new GerenciadorNinjas();

        // 1. Adicionando os sete ninjas iniciais
        sistema.adicionar(new Ninja("Naruto Uzumaki", 16, "Folha"));
        sistema.adicionar(new Ninja("Sasuke Uchiha", 16, "Folha"));
        sistema.adicionar(new Ninja("Gaara", 16, "Areia"));
        sistema.adicionar(new Ninja("Shikamaru Nara", 16, "Folha"));
        sistema.adicionar(new Ninja("Killer Bee", 35, "Nuvem"));
        sistema.adicionar(new Ninja("Mei Terumi", 31, "Névoa"));
        sistema.adicionar(new Ninja("Kurotsuchi", 18, "Pedra"));

        System.out.println("--- Lista Inicial ---");
        sistema.exibirTodos();

        // 2. Remover o primeiro ninja da lista
        Ninja removido = sistema.removerPrimeiro();
        if (removido != null) {
            System.out.println("\n[Operação] Removendo o primeiro ninja: " + removido.nome);
        }

        // 3. Adicionar um novo ninja no início
        Ninja novoNinja = new Ninja("Kakashi Hatake", 30, "Folha");
        sistema.adicionarNoInicio(novoNinja);
        System.out.println("\n[Operação] Adicionando novo ninja no início: " + novoNinja.nome);

        // 4. Acessar um ninja em uma posição específica
        int posicaoBusca = 2;
        Ninja acessado = sistema.acessar(posicaoBusca);
        if (acessado != null) {
            System.out.println("\n[Operação] Acessando o ninja na posição " + posicaoBusca + ": " + acessado.nome);
        }

        // 5. Exibir a lista completa
        System.out.println("\n--- Lista Completa Atualizada ---");
        sistema.exibirTodos();
    }
}