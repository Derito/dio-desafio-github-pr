package com.exercicio.dio;

public class Main {
    public static void main(String[] args) {

        Pilha mpila = new Pilha();
        //Usuando push empilhamento
        mpila.push(new No(1));
        mpila.push(new No(2));
        mpila.push(new No(3));
        mpila.push(new No(4));
        mpila.push(new No(5));
        mpila.push(new No(6));

        System.out.println(mpila);

        //Usando pop
        mpila.pop();
        System.out.println(mpila);

        //Push
        mpila.push(new No(6));
        System.out.println(mpila);
        //Verifica somente
        mpila.top();
        System.out.println(mpila);

    }
}
