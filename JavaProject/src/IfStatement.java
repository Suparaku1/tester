import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");

        int mosha = sc.nextInt();

        if (mosha >= 0 && mosha < 18) {
            System.out.println("Minor");
        } else if (mosha >= 18 && mosha < 65) {
            System.out.println("Adult");
        } else if (mosha >= 65) {
            System.out.println("Senior");
        } else {
            System.out.println("Age " + mosha + " is invalid!");
        }

    }
}
