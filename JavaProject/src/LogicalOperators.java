public class LogicalOperators {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        boolean andRes = b1 && b2; //false

        boolean orRes = b1 || b2; //true

        boolean xorRes = b1 ^ b2; //true

        System.out.println("AND: " + andRes);
        System.out.println("OR: " + orRes);
        System.out.println("XOR: " +xorRes);

    }

}
