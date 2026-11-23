import java.util.ArrayList;
import java.util.List;

public class ListClass {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("A"); //A
        myList.add("C"); //A, C
        myList.add(1, "B"); //A, B, C

        System.out.println(myList.size()); //3

        System.out.println(myList.get(0)); //A

        System.out.println(myList.contains("D")); //false

        System.out.println(myList.indexOf("C")); //2

        boolean isListEmpty = myList.isEmpty();
        System.out.println(isListEmpty); //false

        myList.remove("A"); //B, C
        myList.remove(1); //B

        myList.clear(); //
    }
}
