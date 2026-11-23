import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ju lutem mbushni vektorin me te dhena:");

        int[] myArray = new int[3];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        int min = myArray[0];
        int max = myArray[0];

        System.out.println("Vektori x ka gjatesine: " + myArray.length);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Value from array: " + myArray[i]);
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }

            if (myArray[i] < min) {
                min = myArray[i];
            }
        }

        System.out.println("minimumi eshte: " + min);
        System.out.println("maximumi eshte: " + max);
    }

}