package br.exercicio.dio;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        mensagemNota();
    }

    /*
     *Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
     * e continue a pedir até que o utilizador informe um valor válido.
     */
    private static void mensagemNota() {
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        while (nota < 0 || nota > 10) {
            System.out.println("Valor invalido! Digite nova nota: ");
            nota = scan.nextInt();
        }
    }
}
