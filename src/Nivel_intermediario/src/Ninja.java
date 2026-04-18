public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //criar um metodo publico
    public void SharinganAtivado(){
        System.out.println("O sharingan ativou");
    }

    //metodo string vai ter que retornar uma string
    public String euSouUmNinja(){
        return "Oi, eu sou um ninja";
    }

    //metodo int vai ter que retornar um int
        public int anosParaSeTornarUmHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
        }
}
