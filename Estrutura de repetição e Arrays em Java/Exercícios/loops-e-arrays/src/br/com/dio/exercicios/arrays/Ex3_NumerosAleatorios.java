package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();//para gerar numeros aleatorios
        int[] numerosAleatorios = new int[20]; //vetor

        for (int i = 0; i < numerosAleatorios.length; i++)  { //neste for é feito a iteração enquanto i é menos que numerosAleatorios ele acrescenta +1 ao i
            int numero = random.nextInt(100); //variavel numero receb os numeros  aleatorios
            numerosAleatorios[i] = numero; //o vetor na posição i guarda o número recebido pela variável numero
        }
        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) { //foreach para imprimir os numeros aleatorios
            System.out.print(numero + " ");
        }
        System.out.println("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) { //for each para imprimir seus sucessores. NOTA-SE o incremento de (numero+1)
            System.out.print((numero+1) + " ");
        }
        System.out.println("\nAntecessor dos Números Aleatórios: ");
        for (int numero:numerosAleatorios) { //for each para imprimir os antecessores (numero-1)
            System.out.print((numero-1) + " ");
        }
    }
}
