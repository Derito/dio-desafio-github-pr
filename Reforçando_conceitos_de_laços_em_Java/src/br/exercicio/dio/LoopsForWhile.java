package br.exercicio.dio;

public class LoopsForWhile {
    public static void main(String[] args) {
        //loopFor();
        //lacoWhile();
        // forEBreak();
        //whileEBreak();
        diversos();
        //usandoForEach();
    }

    private static void loopFor() {

        //Faça um laço for que mostre os números 3 a 11 Iterando a cada 2, entretanto quando o ‘loop’
        //passar pelo 7, este não deve ser exibido.
        for (int i = 3; i <= 11; i++, i++) {

            if (i == 7) {
                System.out.print("");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    private static void lacoWhile() {
        //Faça um While que exiba um texo 5 vezes com uma estrutura de controle e uma variavel booleana
        int cont = 1;
        while (cont <= 5) {
            System.out.println("Será impresso cinco vezes este texto!");
            cont++;
        }
    }

    private static void forEBreak() {
        //Faça um for de 1 a 14, sendo que somente multiplos de 2 devem ser listados.
        //Entretanto, quando o ‘loop’ passar pelo 12 deve ser abortado.

        aborta:
        for (int i = 1; 1 <= 14; i++) {
            System.out.print(i + " ");
            if (i == 12) break aborta;

        }
    }

    private static void whileEBreak() {
        //Faça um while de 1 a 14, sendo que somente multiplos de 2 devem ser listados.
        //Entretanto, quando o ‘loop’ passar pelo 12 deve ser abortado.
        int cont = 1;
        aborta:
        while (cont <= 14) {
            System.out.print(cont + " ");
            if (cont == 12) break aborta;
            cont++;

        }

    }

    private static void diversos() {

        int[] idade = new int[10];
        idade[0] = 17;
        idade[1] = 45;

        System.out.println("Idade na posição 0: " + idade[0]);
        System.out.println("Idade na posição 1: " + idade[1]);

        //Ou
        int[] idade1 = {20, 5};
        System.out.println();
        System.out.println("Idade na posição 0: " + idade1[0]);
        System.out.println("Idade na posição 1: " + idade1[1]);

        //Ou
        int[] idade2 = new int[]{30, 19};
        System.out.println();
        System.out.println("Idade na posição 0: " + idade2[0]);
        System.out.println("Idade na posição 1: " + idade2[1]);

        //Ou
        int[] idade3 = {7, 9};
        System.out.println();
        System.out.println("Idade na posição 0: " + idade3[0]);
        System.out.println("Idade na posição 1: " + idade3[1]);

        //char
        char[] ch = new char[3];
        ch = new char[]{'a','g','4'};

        System.out.println();
        for(char i : ch){
            System.out.println("Valores do char: " + i);
        }
        //long
        long[] num = {1234,785645};
        System.out.println();
        for(long k : num){
            System.out.println("Valores do long: " + k);
        }
        //String
        String[] letra = {"água","leite","vinho"};
        System.out.println();
        for(String l : letra){
            System.out.println("Valores do long: " + l);
        }
    }

    private static void usandoForEach() {

        int[] idades = new int[10];
        idades = new int[]{1, 4, 6, 23, 45, 67, 12, 34, 2, 8};
        for (int idade : idades) {
            System.out.println("Idades existentes no array: " + idade);
        }
        //Mesmo exercicio usando for normal
        System.out.println();
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idades existentes no array: " + i);
        }
    }
}
