public class BreakContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 8; ++i) {
            System.out.print(i);
            if (i == 3) {
                continue;
            }

            if (i == 5) {
                break;
            }

            System.out.print("x");
        }

    }
}
