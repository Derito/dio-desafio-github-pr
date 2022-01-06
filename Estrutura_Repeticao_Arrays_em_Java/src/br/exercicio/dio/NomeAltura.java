package br.exercicio.dio;

import java.util.Scanner;

public class NomeAltura {
    public static void main(String[] args) {
        nomeAltura();
    }

    /* Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando
    * a matrícula do aluno e o segundo representando a sua altura em centímetros.
    * (Pare ao inserir o valor 0 no campo nome)
    */
    private static void nomeAltura() {

        Scanner scan = new Scanner(System.in);
        String nome;

        while (true) {
            System.out.println("Digite o nome: ");
            //logger.log("Digite o nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Digite a altura: ");
            double altura = scan.nextDouble();
        }
        System.out.println("Digite valores corretos");
    }

}
