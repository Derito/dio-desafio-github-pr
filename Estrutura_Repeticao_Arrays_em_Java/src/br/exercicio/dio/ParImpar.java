package br.exercicio.dio;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        calculaParEImpar();
    }

    /* Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de
     * números pares e a quantidade de números impares.
     */
    private static void calculaParEImpar() {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros;
        int numero = 0;
        int par = 0;
        int impar = 0;
        int i = 0;
        System.out.println("Quantos números quer: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            i++;
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        } while (i < quantidadeNumeros);
        System.out.println("Foram digitados: " + i + " números.");
        System.out.println("Números pares: " + par);
        System.out.println("Números impares: " + impar);
    }
}
