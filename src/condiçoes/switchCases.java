package condiçoes;


import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("escolha um personagem: ");
        System.out.println("1-Sakura haruno");
        System.out.println("2-Sasuke uchiha");
        System.out.println("3-Naruto uzumaki");
        //pedir para o usuario escolher um

        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("vc digitou o numero: "+ escolhaDoUsuario);


        switch (escolhaDoUsuario) {

            case 1:
                System.out.println("O usuario esclheu o Sakura Haruno, a personagem feminina mais legal ");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke uchicha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuario escolheu o Naruto Uzumaki o proximo hokage");
                break;
            default:
                System.out.println("Vc nao digitou uma resposta valida burro do krlh");


        }


        scanner.close();

    }
}