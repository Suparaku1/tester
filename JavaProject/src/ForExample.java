import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("How many messages?");

        number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("This is message in loop");
        }

    }
}
