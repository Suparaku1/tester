import java.util.Locale;

public class StringExample {

    public static void main(String[] args) {

        String msg = "text ";
        //String msg2 = new String("text");

        int x = msg.length();

        System.out.println("msg length is: " +x); //4

        System.out.println("msg is equal to Text: " +msg.equals("Text")); //false

        System.out.println("msg contains te: " + msg.contains("te")); //true

        System.out.println(msg.concat(" test")); //text test

        String myNewString = msg + "test";

        System.out.println(myNewString); //texttest

        System.out.println(msg.indexOf('e'));  //1

        System.out.println(msg.indexOf('z'));  //-1

        System.out.println(msg.charAt(0)); //'t'

//        System.out.println(msg.charAt(10)); //'t'

        System.out.println(msg.toUpperCase()); //TEXT

        System.out.println(msg.toLowerCase()); //text

        System.out.println(msg.replace("x", "s"));

        System.out.println(msg.substring(1)); //text

        System.out.println(msg.substring(1, 4)); //text

        System.out.println(msg.repeat(5));

        msg = null;

        msg = "";

        msg = "Hello World";
    }
}
