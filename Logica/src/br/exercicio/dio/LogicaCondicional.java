package br.exercicio.dio;

import java.util.Scanner;

public class LogicaCondicional {

    public static void main(String[] args) {

        //usandoIf();
        //usandoSwitchVar();
        usandoIfInc();
       // usandoSwitch();

    }

    private static void usandoIf() {
        Scanner scanner = new Scanner(System.in);
        int mesDoAno = scanner.nextInt();
        // If para expressões booleanas
        if (mesDoAno == 1) {
            System.out.println("Janeiro");
        } else if (mesDoAno == 2) {
            System.out.println("Fevereiro ");
        } else if (mesDoAno == 3) {
            System.out.println("Março ");
        } else if (mesDoAno == 4) {
            System.out.println("Abril ");
        } else if (mesDoAno == 5) {
            System.out.println("Maio ");
        } else if (mesDoAno == 6) {
            System.out.println("Junho ");
        } else if (mesDoAno == 7) {
            System.out.println("Julho ");
        } else if (mesDoAno == 8) {
            System.out.println("Agosto ");
        } else if (mesDoAno == 9) {
            System.out.println("Setembro ");
        } else if (mesDoAno == 10) {
            System.out.println("Outubro ");
        } else if (mesDoAno == 11) {
            System.out.println("Novembro ");
        } else if (mesDoAno == 12) {
            System.out.println("Dezembro ");
        } else {
            System.out.println("Valor não existente ");
        }
    }

    private static void usandoSwitchVar() {
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

    private static void usandoIfInc() {
        Scanner scan = new Scanner(System.in);
        int mesDoAno = scan.nextInt();
        if (mesDoAno == 1 || mesDoAno == 7 || mesDoAno == 12) {
            System.out.println("Ferias");
        }
// Ideal seria fazer em Switch visto ser uma unica variavel
        String mesAno = scan.next();
        switch (mesAno) {
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Mês de trabalho!");
        }
    }

    private static void usandoSwitch() {
        Scanner scan = new Scanner(System.in);
        String diaSemana = scan.next();
        switch (diaSemana) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia não existente");
        }
    }
}
