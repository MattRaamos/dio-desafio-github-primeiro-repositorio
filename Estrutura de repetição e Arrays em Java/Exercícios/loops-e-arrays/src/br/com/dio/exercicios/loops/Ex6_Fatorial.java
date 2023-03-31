package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mult = 1;

        System.out.print("Fatorial: ");
        int fat = teclado.nextInt();

        for (int i = fat; i >= 1; i--){
            mult = mult * i;
        }
        System.out.println(fat + "!" + " = " + mult);
    }
}
