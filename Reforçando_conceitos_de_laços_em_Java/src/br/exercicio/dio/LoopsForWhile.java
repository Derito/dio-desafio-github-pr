package br.exercicio.dio;

public class LoopsForWhile {
    public static void main(String[] args) {
        //loopFor();
        lacoWhile();
    }

    private static void loopFor() {

        //Faça um laço for que mostre os números 3 a 11 Iterando a cada 2, entretanto quando o ‘loop’
        //passar pelo 7, este não deve ser exibido.
        for (int i = 3; i <= 11; i++,i++) {

            if (i == 7) {
                System.out.print("");
            }else {
                System.out.print(i + " ");
            }
        }
    }

    private static void lacoWhile(){
        //Faça um While que exiba um texo 5 vezes com uma estrutura de controle e uma variavel booleana
        int cont = 1;
        while(cont <= 5){
            System.out.println("Será impresso cinco vezes este texto!");
            cont++;
        }
    }
}
