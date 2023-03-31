public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 = true\n" +
                "b2 = false\n" +
                "b3 = true\n" +
                "b4 = false");
        System.out.println("------------------------------------");
        System.out.println("b1 && b2 = " + (b1 && b2)); // E
        System.out.println("b1 || b2 = " + (b1 || b2)); // OU
        System.out.println("b1 ^ b2 = " + (b1 ^ b2)); // OU EXCLUSIVO
        System.out.println("!b2 = " + (!b1)); // NEGAÇÃO
        System.out.println("------------------------------------");
        System.out.println("b1 && b3 = " + (b1 && b3));
        System.out.println("b1 || b3 = " + (b1 || b3));
        System.out.println("b1 ^ b3 = " + (b1 ^ b3));
        System.out.println("!b3 = " + (!b3));
        System.out.println("------------------------------------");
        System.out.println("b2 && b4 = " + (b2 && b4));
        System.out.println("b2 || b4 = " + (b2 || b4));
        System.out.println("b2 ^ b4 = " + (b2 ^ b4));
        System.out.println("!b4 = " + (!b4));
        System.out.println("------------------------------------");
        System.out.println("b2 && b3 = " + (b2 && b3));
        System.out.println("b2 || b3 = " + (b2 || b3));
        System.out.println("b2 ^ b3 = " + (b2 ^ b3));
        System.out.println("!b2 = " + (!b2));
        System.out.println("------------------------------------");
        System.out.println("b4 && b3 = " + (b4 && b3));
        System.out.println("b4 || b3 = " + (b4 || b3));
        System.out.println("b4 ^ b3 = " + (b4 ^ b3));
        System.out.println("------------------------------------");
        System.out.println("b4 && b1 = " + (b4 && b1));
        System.out.println("b4 || b1 = " + (b4 || b1));
        System.out.println("b4 ^ b1 = " + (b4 ^ b1));
        System.out.println("------------------------------------");
    }
}
