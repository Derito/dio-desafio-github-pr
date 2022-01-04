package br.exercicio.dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        //enviaNota();
        mensagem();
    }

    /*
     *Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
     * e continue a pedir até que o utilizador informe um valor válido.
     */
    private static void mensagem() {
        Scanner scan = new Scanner(System.in);
       // System.out.println();
        int nota = 0;
        do {
            System.out.println("Valor invalido");
            nota = scan.nextInt();
        } while (nota < 0 || nota > 10);
        System.out.println("A nota é: " + nota);
    }

    private static void enviaNota() {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int dimensao = 10;

        for (int i = 0; i <= dimensao; i++) {
            System.out.println("Digite o número: " + (i + 1) + "posição: ");
            array.add(scan.nextInt());
        }
        //Collections.reverse(array);
        System.out.print("\nReverse Array: ");
        System.out.print(array.toString());
    }
}
