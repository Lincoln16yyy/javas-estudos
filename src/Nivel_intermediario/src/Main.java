import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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



    }
}
