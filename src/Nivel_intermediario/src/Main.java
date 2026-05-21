import java.util.*;

public class Main {
    static void main(String[] args) {
        //array
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        //Listas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        //Stack
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.add("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");

        System.out.println("Minha Stack é: "+ ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha Stack atualizada é: "+ ninjasStack);
        System.out.println("Minha Stack com o peak: "+ ninjasStack.peek());

        //QUEUE // FILAS

        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        //Mostrar QUEUE

        System.out.println("Minha Queue é: "+ ninjasQueue);

        //Tirar um ninja da fila

        ninjasQueue.poll();
        System.out.println("Minha Queue atualizada é: "+ ninjasQueue);

        //como ver quem é o primeiro

        System.out.println("Ninja no head da fila: "+ ninjasQueue.peek());

        //adicionar ninjas a fila

        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");

        System.out.println("Minha Queue atualizada é: "+ ninjasQueue);

        //verificar se a fila esta vazia
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia");
        }else {
            System.out.println("A fila não está vazia");
        }
        //esvaziar fila
        ninjasQueue.clear();
        System.out.println("Minha Queue vazia é: "+ ninjasQueue);

        if (ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia");
        }else {
            System.out.println("A fila não está vazia");
        }







    }
}
