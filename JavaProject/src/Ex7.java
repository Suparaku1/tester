import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        System.out.println("Whats your name sir");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Provide name " + name);

        if (name.equals("Valentin Demiraj")){
            System.out.println("You haven't quit yet Valentin?");
        } else if (name.equals("Valentin")) {
            System.out.println("You are late for work agan Mr. Demiraj");
        } else {
            System.out.println("Welcome, sir.  "+name);
        }
    }
}