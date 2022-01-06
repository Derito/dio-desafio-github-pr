package br.exercicio.dio;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        calculaTabuada();
    }

    /* Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
     * entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser
     * conforme o exemplo abaixo:
     *  Tabuada de 5:
     *   5 X 1 = 5
     *   5 X 2 = 10
     *   ...
     *   5 X 10 = 50
     */
    private static void calculaTabuada() {
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Digite o número da tabuada: ");
        numero = scan.nextInt();
        System.out.println("Tabuada de: " + numero);
        int i = 1;

        for (i = 1; i <= 10; i++) {
            int multiplicador = numero * i;
            System.out.println(numero + " X " + i + " = " + multiplicador);
        }

    }
}
