package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Exercício Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5,5);
        Quadrilatero.area(7,8,5);*/

        //abaixo usando a exibição com o return na classe quadrilatero

        System.out.println("Exercício Retorno");
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Area do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,2);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
