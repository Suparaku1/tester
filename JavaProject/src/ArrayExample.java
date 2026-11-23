import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cfare gjatesie do te kete vektori?");
        int number = sc.nextInt();

        int[] myArray = new int[number];

        System.out.println("Ju lutem mbushni vektorin me te dhena:");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        System.out.println("Vektori x ka gjatesine: " + myArray.length);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Elementi me indeks " +i+ " i vektorit ka vleren " +myArray[i]);
        }

        int[] y = {2, 5, 7, 1};

        int[][] matrix = new int[2][2];

    }
}
