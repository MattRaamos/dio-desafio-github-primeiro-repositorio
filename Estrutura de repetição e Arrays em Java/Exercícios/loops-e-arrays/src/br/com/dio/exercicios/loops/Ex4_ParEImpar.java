package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        System.out.println("QUANTOS NÚMEROS IMPARES E PARES EU DIGITEI?");
        System.out.println();
        System.out.println("*******************************************");
        System.out.println();
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qtdNumero;
        int count = 0;
        int numPar = 0, numImpar = 0;

        System.out.print("Quantos números você quer digitar: ");
        qtdNumero = teclado.nextInt();
        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                numPar++;
            } else {
                numImpar++;
            }
            count++;
        }while (count < qtdNumero);
        System.out.println();
        System.out.println("Você digitou " + numImpar + " números impares.");
        System.out.println("Você digitou " + numPar + " números pares. ");
        System.out.println();
        System.out.println("*******************************************");
    }
}
