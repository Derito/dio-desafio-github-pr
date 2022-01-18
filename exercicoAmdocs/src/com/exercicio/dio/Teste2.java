package com.exercicio.dio;

import java.io.IOException;
import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) throws IOException {
        /*
         * João compra móveis novos para a sua casa. Agora é a vez de comprar um colchão novo,
         *  de molas, para substituir o colchão velho. As portas da sua casa têm (altura) H e largura L e
         *  existe um colchão que está em promoção com dimensões A × B × C.
         *  O colchão tem a forma de um paralelepípedo reto retângulo e João só consegue arrastá-lo
         *  através de uma porta com uma das suas faces paralelas ao chão, mas consegue virar e rotacionar
         *  o colchão antes de passar pela porta.
         * Entretanto, de nada adianta ele comprar o colchão se ele não passar através das portas da
         * sua casa. Portanto, ele quer saber se consegue passar o colchão pelas portas e para isso
         * precisa da sua ajuda.
         * Entrada
         * A primeira linha da entrada contém três números inteiros A, B e C (1 ≤ A, B, C ≤ 300),
         * as três dimensões do colchão, em centímetros. A segunda linha contém dois inteiros H e L
         * (1 ≤ H, L ≤ 250), respetivamente a altura e a largura das portas em centímetros.
         * Saída
         * Se programa deve escrever uma única linha, contendo apenas a letra ‘S’ se o colchão passa
         *  pelas portas e apenas a letra ‘N’ em caso contrário.
         * Exemplos de Entrada	Exemplos de Saída
         * 25 120 220                  S
         * 200 100                     S
         * 25 205 220                  N
         * 200 100                     N
         * 25 200 220                  S
         * 200 100                     S
         */
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        //Complete o problema com o seu código .

        if (A <= H && (B <= L || C <= L)) {
            System.out.println("S");
        } else if (A <= L && (B <= H || C <= H)) {
            System.out.println("S");
        } else if (B <= H && (A <= L || C <= L)) {
            System.out.println("S");
        } else if (B <= L && (A <= H || C <= H)) {
            System.out.println("S");
        } else if (C <= H && (A <= L || B <= L)) {
            System.out.println("S");
        } else if (C <= L && (A <= H || B <= H)) {
            System.out.println("S");
        } else {
            System.out.println("N");

        }

    }

}
