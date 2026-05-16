public class Main {
    static void main(String[] args) {

        equipamentosNinjas Kunai =new equipamentosNinjas("kunai de ferro");
        equipamentosNinjas Shuriken =new equipamentosNinjas("Shuriken de ferro");
        equipamentosNinjas pergaminho =new equipamentosNinjas("pergaminho");

        bolsaGenerica <equipamentosNinjas> bolsa = new bolsaGenerica<>();
        bolsa.adicionarEquipamento(Kunai);
        bolsa.adicionarEquipamento(Shuriken);
        bolsa.adicionarEquipamento(pergaminho);

        System.out.println(bolsa);


    }
}
