package com.exercicio.dio;

public class main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista2Encadeada = new ListaDuplamenteEncadeada<>();

        lista2Encadeada.add("lista 1");
        lista2Encadeada.add("lista 2");
        lista2Encadeada.add("lista 3");
        lista2Encadeada.add("lista 4");
        lista2Encadeada.add("lista 5");
        lista2Encadeada.add("lista 6");
        lista2Encadeada.add("lista 7");

        System.out.println(lista2Encadeada);
        lista2Encadeada.remove(4);
        lista2Encadeada.add(4,"99");

        System.out.println(lista2Encadeada);
    }
}
