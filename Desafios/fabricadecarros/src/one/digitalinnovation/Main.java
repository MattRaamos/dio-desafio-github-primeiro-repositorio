package one.digitalinnovation;

import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int PercentualImpostos = scan.nextInt();

        int Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        int ValorImpostos = (custoFabrica * PercentualImpostos) / 100;

        int custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;

        System.out.println(custoConsumidor);
    }
}
