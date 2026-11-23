import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Input number:");
        number = sc.nextInt();

        for (int i = 1; i <= number; i+=2) {
            System.out.println("Odd number " + i);
        }
    }
}
