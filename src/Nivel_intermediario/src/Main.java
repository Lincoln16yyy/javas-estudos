import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto");
        ninjaList.add("Sasuke");
        ninjaList.add("Sakura");
        System.out.println(ninjaList);

        //remover da lista
        ninjaList.remove(1);
        System.out.println(ninjaList);

        //adicionar a lista
        ninjaList.add(1,"Tobirama");
        System.out.println(ninjaList);


        //trocar elementos
        ninjaList.set(1,"Kakashi");
        System.out.println(ninjaList);

        //ver o tamnaho da lista
        System.out.println(ninjaList.size());


    }
}
