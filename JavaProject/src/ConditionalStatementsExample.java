public class ConditionalStatementsExample {

    public static void main(String[] args) {

        int x = 10;

        // if statement
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        // if-else statement
        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        // switch statement
        switch (x) {
            case 5:
                System.out.println("x is 5");
                break;
            case 10:
                System.out.println("x is 10");
                break;
            default:
                System.out.println("x is neither 5 nor 10");
        }
    }
}