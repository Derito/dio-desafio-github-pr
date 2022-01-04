package br.exercicio.dio;

public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int casa = 24;
        int predio = 360;


        boolean resultado = b1 && b2;
        boolean resultado1 = b1 || b2;
        boolean resultado2 = b1 && b3;
        boolean resultado3 = b2 ^ b4;

        boolean resultado4 = ((casa < predio) ||(predio != casa));
        boolean resultado5 = (predio != casa);

        System.out.println("O valor b1 && b2 é: " + resultado);
        System.out.println("O valor b1 || b2 é: " + resultado1);
        System.out.println("O valor b1 && b3 é: " + resultado2);
        System.out.println("O valor b2 ^ b4 é: " + resultado3);
        System.out.println("O valor é: " + resultado4);
        System.out.println("O valor é: " + resultado5);
        System.out.println("Negação" + (!b1));
    }
}
