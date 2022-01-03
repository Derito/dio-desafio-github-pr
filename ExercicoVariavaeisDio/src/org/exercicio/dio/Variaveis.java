package org.exercicio.dio;

public class Variaveis {

    public static void main(String[] args) {

        // não se aplica aqui a visibilidade das variaveis por estarem descritas na main
       final String MEU_CAO = "Sasha"; //Declaração de uma variavel constante e inicialização
        int num = 8; // Não mostra expressividade
        //MEU_CAO = "Ruby"; //Não permite alterar o valor da variavel final (constante)
        // private int loja = 0; // Declaração normal de uma variavel e inicialização
        // String MEU_CAO;//Erro variavel ja existente e em mauiscula
        int lojaGelados = 29; //Declaração normal de uma variavel usando camel case
         //int $loja; // Não é uma boa prática
         //int _loja; // Não é uma boa prática
        //private int loja%; //erro de compilação por usar caracteres proibidos como  @, % [ { etc
        //private int loja gelados; // Erro de copilação por usar espaço entre variaveis
        // private String MEU_CACHORRO = "Ruby"; // Recomenda que seja final por usar maisculas
        //private int 45loja; // Erro de copilação por usar numeros no principio da variavel
         int loja45 = 20; // variavel normal
        System.out.println("O nome do cão " +MEU_CAO);
        System.out.println(lojaGelados);
        System.out.println(loja45);
    }
}
