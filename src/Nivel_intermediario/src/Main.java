public class Main {
    public static void main(String[] args) {
        Ninja Sasuke = new Ninja();
        Sasuke.nome="Sasuke uchiha";
        Sasuke.idade=18;
        Sasuke.aldeia="aldeia da folha";

        //aplicar metodos ao obejto
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarUmHokage( 70);
        System.out.println("Voce tem: " + Sasuke.idade + " entao falta no minimo: " + quantoTempoFalta + " anos para vc se tornar um hokage");






    }

}