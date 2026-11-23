import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

        System.out.println("Ju lutem, vendosni mesazhin: ");

        Scanner sc = new Scanner(System.in);

        String message = sc.next();

        System.out.println("Your message: " +message);

    }
}
