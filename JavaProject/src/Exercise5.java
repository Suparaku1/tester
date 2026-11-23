import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first integer number please: ");
        int a = sc.nextInt();
        System.out.println("Input second integer number please: ");
        int b = sc.nextInt();

        double sum = (double) a + b;
        System.out.println("a= " + a + ", " + "b= " + b + ", sum is: " + sum);

        double sub = (double) a - b;
        System.out.println("a= " + a + ", " + "b= " + b + ", difference is: " + sub);

        double exp = (double) a * b;
        System.out.println("a= " + a + ", " + "b= " + b + ", multiplication is: " + exp);

        double div = (double) a / b;
        System.out.println("a= " + a + ", " + "b= " + b + ", division is: " + div);

        int mod = a % b;
        System.out.println("a= " + a + ", " + "b= " + b + ", module is: " + mod);
    }
}