package br.com.dio.exercicios.loops;
import java.util.Scanner;
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        //variáveis
        int numero;
        int maior = 0;
        int soma = 0;
        int contador = 0;
        int qtd = 0;

        // recebe entrada de dados pelo teclado
        Scanner teclado = new Scanner(System.in);

        //solicita quantos números o usuário quer digitar
        System.out.print("Quantos números você quer digitar: ");
        qtd = teclado.nextInt(); //recebe a qtd a ser digitada

        do {
            contador++; //contador a cada loop feito atualiza o valor até que a condição seja satisfeita

            System.out.print("Digite o " + contador + "º número: ");
            numero = teclado.nextInt();
            soma = soma + numero; //soma recebe o valor atual dela + o número digitado e atualiza o valor na variável soma
            if (numero > maior) maior = numero; //pega o número atual digitado e verifica se ele é maior do que o maior atual
        } while (contador < qtd); //enquanto o contador for menor que a qtd desejada a ser digitada ele faz o loop

        System.out.println("Foi digitado um total de " + contador  + " números.");
        System.out.println("A soma de todos os números foi de " + soma);
        System.out.println("A média foi: " + (soma / contador));
        System.out.println("O maior número digitado foi " + maior);
    }
}
