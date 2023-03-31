package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = "";
        int idade;

//Optei por usar o !name.equals("0") doq if(nome.equals("0")) pq achei que ficaria mais compacto o código e mais legível
        while (!nome.equals("0")) {
            System.out.println("Digite seu nome: ");
            nome = teclado.next();
            System.out.println("Digite sua idade: ");
            idade = teclado.nextInt();
        }
        System.out.println("Programa encerrado!");
    }

}
