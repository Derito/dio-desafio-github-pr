package br.exercicio.dio;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        calculaMaiorEMedia();
    }

    /* Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média
     * desses números.
     */
    private static void calculaMaiorEMedia() {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int i = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            i++;
            soma = numero + soma;
            if(numero > maior) maior = numero;
        } while (i < 5);
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("A média é: " + (soma/5));
    }

}
