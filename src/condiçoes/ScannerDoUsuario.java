package condiçoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {


        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Escreva aqui o nome do maior baitola do nordeste: ");

        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do baitola é: " + nomeDoNinja);

        System.out.println("Escreva aqui a idade do seu baitola ");
        int idadeDoBaitola = caixaDeTexto.nextInt();
        System.out.println(" a idade do seu baitola é " + idadeDoBaitola);


        if (idadeDoBaitola >= 18) {
            System.out.println("esse baitola pode dar a bunda");
        } else {
            System.out.println("esse baitola nao pode dar a bunda");
        }
    

        caixaDeTexto.close();

    }
}