package com.exercicio.dio;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("lista 1");
        minhaListaEncadeada.add("lista 2");
        minhaListaEncadeada.add("lista 3");
        minhaListaEncadeada.add("lista 4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.remove(3));

        System.out.println(minhaListaEncadeada);
    }
}
