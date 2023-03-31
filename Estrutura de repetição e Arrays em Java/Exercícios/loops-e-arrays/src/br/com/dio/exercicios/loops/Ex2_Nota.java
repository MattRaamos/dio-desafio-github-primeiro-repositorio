package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        System.out.print("Nota: ");
        nota = teclado.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida! Digite novamente: ");
            nota = teclado.nextInt();
        }
        System.out.println("A nota é " + nota);
    }
}
