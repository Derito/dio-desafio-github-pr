package com.exerccicio.dio;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<String>();

        minhaListaCircular.add("lista 1");
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("lista 1");
        minhaListaCircular.add("lista 2");
        minhaListaCircular.add("lista 3");

        System.out.println(minhaListaCircular);
        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(1));
        System.out.println(minhaListaCircular.get(2));

        //Continua a imprimir em ‘loop’ continuo a começar sempre pela cauda.
        for(int i = 0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }
    }
}
