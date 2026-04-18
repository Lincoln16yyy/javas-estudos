package condiçoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {


        Scanner numeroDeMissoes = new Scanner (System.in);
        System.out.println("quantas missoes ele fez mesmo ?");
        int missoes = numeroDeMissoes.nextInt();
        String nivel = (missoes>= 10)? "Esse ninja esta com mais de 10 missoes": "esse ninja ta mentindo safado";
        System.out.println(nivel);



        numeroDeMissoes.close();

    }
}