import java.util.LinkedList;

public class linked_List {
    static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("Naruto");
        linkedList.add("Sasuke");
        linkedList.add("Sakura");
        System.out.println(linkedList);
        linkedList.add(1,"Kakashi");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);



    }
}
