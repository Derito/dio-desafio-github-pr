package br.exercicio.dio;

import java.util.Scanner;

public class LogicaCondicional {

    public static void main(String[] args) {

        //Condicional ternário
        //Meses de 31 dias Janeiro, Março, Maio, Julho, Agosto, Outubro, Dezembro
        //Meses de 30 dias Abril, Junho, Setembro, Novembro
        // 20/29 Fevereiro

        Scanner scanner = new Scanner(System.in);
        int resultado = scanner.nextInt();
        // If para expressões booleanas
        if (resultado == 1) {
            System.out.println("Janeiro");
        } else if (resultado == 2) {
            System.out.println("Fevereiro ");
        } else if (resultado == 3) {
            System.out.println("Março ");
        } else if (resultado == 4) {
            System.out.println("Abril ");
        } else if (resultado == 5) {
            System.out.println("Maio ");
        } else if (resultado == 6) {
            System.out.println("Junho ");
        } else if (resultado == 7) {
            System.out.println("Julho ");
        } else if (resultado == 8) {
            System.out.println("Agosto ");
        } else if (resultado == 9) {
            System.out.println("Setembro ");
        } else if (resultado == 10) {
            System.out.println("Outubro ");
        } else if (resultado == 11) {
            System.out.println("Novembro ");
        } else if (resultado == 12) {
            System.out.println("Dezembro ");
        } else {
            System.out.println("Valor não existente ");
        }

        // 2
        if (resultado == 1 || resultado == 7 || resultado == 12) {
            System.out.println("Ferias");
        }

        Scanner scan = new Scanner(System.in);
        String diaSemana = scan.next();

        switch (diaSemana) {
            case "Segunda":
                System.out.println("2 ");
                break;
            case "Terça":
                System.out.println("3");
                break;
            case "Quarta":
                System.out.println("4");
                break;
            case "Quinta":
                System.out.println("5");
                break;
            case "Sexta":
                System.out.println("6");
                break;
            case "Sabado":
                System.out.println("7 ");
                break;
            case "Domingo":
                System.out.println("1");
                break;
            default:
                System.out.println("Dia não existente");
        }
        Scanner scane = new Scanner(System.in);
        int variavel = scane.nextInt();

        switch (variavel) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Fora do rating ou valor indefinido!");
                break;
        }
    }
}
