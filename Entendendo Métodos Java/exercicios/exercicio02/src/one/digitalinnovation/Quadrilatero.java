package one.digitalinnovation;

public class Quadrilatero {
/*    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura)/2);
    }*/

    ///abaixo o método estão com retorn, sem o void

    public static double area(double lado) {
        return lado * lado;
    }
    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }
    public static double area(double baseMaior, double baseMenor, double altura){
       return ((baseMaior+baseMenor)*altura)/2;
    }
}
