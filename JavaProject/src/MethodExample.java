import java.util.Date;

public class MethodExample {

    public static void main(String[] args) {
        int x = sum(2, 3);
        System.out.println(x);

        printMessage("Hello World");

        int currentDay = getCurrentDay();
        System.out.println(currentDay);

        printCurrentDay();

    }

    /**
     * This is a method that takes 2 int arguments and return
     * their sum.
     * @param a first int number
     * @param b second int number
     * @return sum of parameter a and b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static int getCurrentDay() {
        Date  date = new Date();
        return date.getDay();
    }

    public static void printCurrentDay() {
        Date  date = new Date();
        System.out.println(date.getDay());
    }


}
