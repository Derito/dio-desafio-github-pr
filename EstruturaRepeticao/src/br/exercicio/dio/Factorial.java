package br.exercicio.dio;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        calculaFactorial();
    }

    /* Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
     *  Ex.: 5!=5.4.3.2.1=120
     */
    private static void calculaFactorial() {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Digite o número desejado: ");
        numero = scan.nextInt();
        int factorial = 1;
        int i;
        System.out.println("Factorial !" + numero + " é: 5");

        for (i = numero; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
