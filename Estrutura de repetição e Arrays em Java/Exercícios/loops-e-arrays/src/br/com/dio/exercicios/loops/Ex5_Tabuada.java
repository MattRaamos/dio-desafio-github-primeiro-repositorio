package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
/* //Programa feito com Do-While
        int contador = 1;

        System.out.print("Qual tabuada você quer ver: ");
        int tabuada = teclado.nextInt();
        System.out.print("Tabuada de 1 até ...: ");
        int finalt = teclado.nextInt();
        do {
            System.out.println(tabuada + " X "
                    + contador + " = "
                    + (tabuada*contador));
            contador++;
        } while (contador <= finalt);
        System.out.println("FIM DO PROGRAMA");*/
        //feito com for
        System.out.print("Tabuada do: ");
        int tabuada = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
