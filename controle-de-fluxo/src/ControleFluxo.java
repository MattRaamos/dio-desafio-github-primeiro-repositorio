import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
// Utilizando o switch em uma simples aplicação e acrescentando a entrada de dados com o Scanner
        Scanner teclado = new Scanner(System.in); //para solicitar a entrada de dados
        System.out.print("Digite o número do mês do seu aniversário: ");
        int mesAniver = teclado.nextInt(); //recebe o dado do usuário e grava na variável

        switch (mesAniver) {
            case 1:
                System.out.println("Janeiro é o mês do seu aniversário");
                break;
            case 2:
                System.out.println("Fevereiro é o mês do seu aniversário");
                break;
            case 3:
                System.out.println("Março é o mês do seu aniversário");
                break;
            case 4:
                System.out.println("Abril é o mês do seu aniversário");
                break;
            case 5:
                System.out.println("Maio é o mês do seu aniversário");
                break;
            case 6:
                System.out.println("Junho é o mês do seu aniversário");
                break;
            case 7:
                System.out.println("Julho é o mês do seu aniversário");
                break;
            case 8:
                System.out.println("Agosto é o mês do seu aniversário");
                break;
            case 9:
                System.out.println("Setembro é o mês do seu aniversário");
                break;
            case 10:
                System.out.println("Outubro é o mês do seu aniversário");
                break;
            case 11:
                System.out.println("Novembro é o mês do seu aniversário");
                break;
            case 12:
                System.out.println("Dezembro é o mês do seu aniversário");
                break;
            default:
                System.out.println("Não há nenhum mês com esse número");
                break;

        }
    }
}