package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //recebe entrada de dados

        String[] consoantes = new String[6]; //vetor declarado com 6 posições

        int qtdConsoantes = 0; //contador de qtd de consoantes encontradas no vetor, inicia com zero
        int contador = 0; //contador para percorrer o vetor e fazer a iteração

        do {
            System.out.print("Letra: "); //solicita a letra
            String letra = scan.next();
            //no if ele compara se a letra enviada é diferente das vogais
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra; //se diferente, a variável letra recebe ela
                qtdConsoantes++; //e o contador de consoantes recebe uma adição
            }
            contador++;
        } while (contador < consoantes.length); //enquanto contador for menor que o vetor
        System.out.println("Consoantes encontradas no vetor: ");
        for (String consoante : consoantes) { //declaro o tipo e uma variável para percorrer o vetor e fazer o output
            if (consoante != null) //para evitar que o programa imprima "null", pois ele mostrará apenas as consoantes, as vogais apareceram como null
                System.out.print(consoante + " "); //e imprimo as consoantes encontradas no vetor
        }
        System.out.println("\nQuantidade de consoantes: " + qtdConsoantes);
        System.out.println("Tamanho do vetor: " + consoantes.length);
    }
}