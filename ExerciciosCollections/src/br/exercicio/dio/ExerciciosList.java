package br.exercicio.dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExerciciosList {
    public static void main(String[] args) {
        //listCollections();
        exercicioLista();
    }

    private static void listCollections() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Julio");
        nomes.add("Hélcio");
        nomes.add("Félicio");
        nomes.add("Marcos");
        nomes.add("Adriano");

        //Usando o metodo set para mudar as posições
        //nomes.set(2,"Marcos");
        System.out.println("Lista de nomes: " + nomes);
        //Ordenando usando Collections
        Collections.sort(nomes);
        System.out.println("Lista de ordenada de nomes usando Collections: " + nomes);
        nomes.set(3, "Hélder");
        System.out.println(nomes);
        nomes.remove("Marcos");
        System.out.println(nomes);
        nomes.remove(2);
        System.out.println(nomes);
        int posicao = nomes.indexOf("Hélcio");//Note que foi removido posição 2
        System.out.println(posicao);
        boolean temJose = nomes.contains("José");
        System.out.println(temJose);
        boolean listaVazia = nomes.isEmpty();

        for (String nomeDoItem : nomes) {
            System.out.println(nomeDoItem);
        }
        //Usado apartir de um while
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {//Navega apartir do Arrayy
            System.out.println("------->" + iterator.next());
        }
        nomes.clear();
        System.out.println(nomes);
        listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);
    }

    private static void exercicioLista() {
        /* Crie uma lista e execute e execute as seguintes operações:
         *  1 — Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
         *  2 — Navegue na lista exibindo cada nome na (consola).
         *  3 — Substitua o nome Carlos por Roberto.
         *  4 — Retorne o nome da posição 1.
         *  5 — Remova o nome João.
         *  6 — retorne a quantidade de itens na lista.
         *  7 — Verifique se o nome Juliana existe.
         *  8 — Crie uma lista com os nomes Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista
         * criada.
         *  9 — Ordene os itens da lista por ordem alfabetica.
         *  10 — Verifique se a lista esta vazia.
         */
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2,"Roberto");
        System.out.println(nomes);
        int posicao = nomes.indexOf("Pedro");
        System.out.println(posicao);
        nomes.remove(4);
        System.out.println(nomes);
        System.out.println(nomes.size());

       boolean nomeJuliana = nomes.contains("Juliana");
        System.out.println(nomeJuliana);
    }
}
