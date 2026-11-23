import java.util.Scanner;

public class PrintFullName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName;
        String lastName;

        System.out.print("Please enter your first name: ");
        firstName = sc.next();

        System.out.print("Please enter your last name: ");
        lastName = sc.next();

        String fullName = firstName + " " + lastName; //firstName.concat(" ").concat(lastName);
        int length = firstName.length() + lastName.length();

        System.out.println("Your full name is: " +fullName);

        System.out.println("Your name credentials length is: " +length);
    }
}
