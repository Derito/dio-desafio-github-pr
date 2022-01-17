package com.exercicio.dio.refatorado;

import com.exercicio.dio.Fila;

public class MainRefatorado {
    public static void main(String[] args) {
        FilaRefatorado<String> minhaFila = new FilaRefatorado<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");
        minhaFila.enqueue("Quinto");
        minhaFila.enqueue("Sexto");
       //minhaFila.enqueue(7); Erro pelo facto de se usar generics com tipo especifico String

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue("Setimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}
