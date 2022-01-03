package org.exercicio.dio;

public class Casting {

    public static void main(String[] args) {

        int i = 8;
        long a = 234568;
        byte b = 22;
        float c = 2.3f;
        double d = 2.7777777d;
        short e = 2234;

        // int
        i = (int) a;// Necessário casting porque estamos atribuindo a uma variavel int um long > capacidade
        a = i; // Não necessita casting por a ser long e i int menor capacidade
        i = b;// Não necessita casting por i ser int e b byte menor capacidade
        b = (byte) i; // Necessário casting porque estamos atribuindo a uma variavel byte um int > capacidade
        i = (int) c; // Necessário casting porque estamos atribuindo a uma variavel int um float > capacidade
        c = i;// Não necessita casting por c ser float e i int menor capacidade
        i = (int) d;// Necessário casting porque estamos atribuindo a uma variavel int um double > capacidade
        d = i;// Não necessita casting por d ser double e i int menor capacidade

        //Long
        a = b;//Não necessita casting por a ser long e b byte menor capacidade
        b = (byte) a;// Necessário casting porque estamos atribuindo a uma variavel byte um long > capacidade
        a = (long) c;// Necessário casting porque estamos atribuindo a uma variavel byte um float > capacidade
        c = a;//Não necessita casting por c ser float e a long menor capacidade
        a = (long) d;// Necessário casting porque estamos atribuindo a uma variavel long um double > capacidade
        d = a;//Não necessita casting por d ser double e a long menor capacidade

        //byte
        b = (byte) c;// Necessário casting porque estamos atribuindo a uma variavel byte um float > capacidade
        c = b;//Não necessita casting por c ser float e b byte menor capacidade
        b = (byte) d;// Necessário casting porque estamos atribuindo a uma variavel byte um double > capacidade
        d = b;//Não necessita casting por d ser double e b byte menor capacidade

        //float e double
        c = (float) d;// Necessário casting porque estamos atribuindo a uma variavel float um double > capacidade
        d = c;//Não necessita casting por d ser double e c float menor capacidade

        //short
        e = (short) i;
        i = e;
        e = b;
        b = (byte) e;
        e = (short) c;
        c = e;
        e = (short) d;
        d = e;

        //Exemplos
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
