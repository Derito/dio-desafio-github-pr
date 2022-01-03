package org.exercicio.dio;

public class Tipos {

    public static void main(String[] args) {

        char letra = 't';
        //char letraMaiuscula = 'Tf';// Erro por inserção de mais de um caracter
        byte b = 10;
        byte c = 2;
        //short curto = 1200000;//  Valor acima da capacidade
        short curto1 = 234;
        long longo = 198755566L;
       // long longo1 = 122287.2; // erro por inserção de valor double em int
        float f = 1.3f;
        //float f1 = 1.3; // Erro por inserção de valor double
        double d = 2.4;
        double d1 = 2.4d;
        String descricao = "Estudo dos tipos";
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(letra);
        System.out.println(b);
        System.out.println("Letra - " + letra);
        System.out.println("Descrição dos tipos - " + descricao);
        System.out.println("Exemplo boolean - " + verdadeiro);
        System.out.println(curto1);
        System.out.println(longo);
        System.out.println(f);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(verdadeiro);
        System.out.println(falso);
    }
}
