package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {6, 1, 22, 7, 16, 24}; //vetor de 6 posições
        int contador = 0; //contador inicia com zero

        while (contador < vetor.length) { //enquanto contador for menor que o vetor ele faz a tarefa abaixo:
            System.out.print(vetor[contador] + " "); //imprime o vetor na posição do contador
            contador++; //faz a iteração para a próxima posição do vetor
        }
        System.out.println();
        for (int i = (vetor.length - 1); i >= 0; i--) { //para mostrar o inverso do vetor
            // o i recebe o tamanho do vetor - 1 pois o vetor tem 5 posições, mas 6 elementos uma vez que o vetor começa em 0
            // enquanto o i for maior ou igual ao vetor ele subtrai uma posição do vetor. Fazendo isso o vetor será impresso ao contrário
            System.out.print(vetor[i] + " ");
        }
    }
}

