
import java.util.LinkedList;

public class GerenciadorNinjas {
    private LinkedList<Ninja> lista;

    public GerenciadorNinjas() {
        this.lista = new LinkedList<>();
    }

    // Adiciona no final da lista
    public void adicionar(Ninja ninja) {
        lista.add(ninja);
    }

    // Adiciona no início da lista
    public void adicionarNoInicio(Ninja ninja) {
        lista.addFirst(ninja);
    }

    // Remove e retorna o primeiro ninja
    public Ninja removerPrimeiro() {
        if (!lista.isEmpty()) {
            return lista.removeFirst();
        }
        return null;
    }

    // Acessa um ninja por posição
    public Ninja acessar(int posicao) {
        if (posicao >= 0 && posicao < lista.size()) {
            return lista.get(posicao);
        }
        return null;
    }

    // Exibe todos os ninjas da lista
    public void exibirTodos() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posição " + i + " -> " + lista.get(i).toString());
        }
    }
}
