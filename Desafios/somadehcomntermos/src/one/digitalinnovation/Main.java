package one.digitalinnovation;

import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }

        System.out.println(Math.round(h));
    }
}
