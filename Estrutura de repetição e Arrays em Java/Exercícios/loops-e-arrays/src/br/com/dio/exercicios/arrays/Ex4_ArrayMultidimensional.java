package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();//para gerar numeros aleatorios
        int[][] M = new int[4][4];//matriz 4x4

        for (int i = 0; i < M.length; i++) { //um for para percorrer as linhas da matriz
            for (int j = 0; j < M[i].length; j++) { //um outro for para percorrer as colunas da linha
                M[i][j] = random.nextInt(9); //e preencher com numeros aleatorios entre 0 e 9
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) { //output com foreach onde ele percorre a linha da matriz
            for (int coluna : linha) { // e aqui percorre a coluna da linha selecionada
                System.out.print(coluna + " "); //imprime linha por linha, coluna por coluna até completar a matriz 4x4
            }
            System.out.println();//para dar espaço entra as linha da matriz = a cada 4 ele pula a linha
        }
    }
}
