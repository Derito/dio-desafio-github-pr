package br.exercicio.dio;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        char a = 12;
        long b = 245672;
        byte c = 78;
        float d = 675.6f;
        double e = 99998644.987665;
        boolean b1 = true;
        boolean b2 = false;
        int f = 1567;
        int g = 2345;
        char ch = 't';
        String s = "Meu Teste";
        String s1 = " Testando";

        //Int e int
        System.out.println(" Valor f = g :" + (f == g));
        System.out.println(" Valor f <= g :" + (f <= g));
        System.out.println(" Valor f >= g : " + (f >= g));
        System.out.println(" Valor f < g :" + (f < g));
        System.out.println(" Valor f > g : " + (f > g));
        System.out.println("Valor f != g: " + (f != g));
//Int e char
        System.out.println(" Valor f = a " + (f == a));
        System.out.println(" Valor f <= a " + (f <= a));
        System.out.println(" Valor f >= a " + (f >= a));
        System.out.println(" Valor f < a " + (f < a));
        System.out.println(" Valor f > a " + (f > a));
        System.out.println("Valor f != a: " + (f != a));

        //Não se compara int, long, char, byte, float, double ou boolean com string

        //Char e long
        System.out.println(" Valor a = b : " + (a == b));
        System.out.println(" Valor a <= b : " + (a <= b));
        System.out.println(" Valor a >= b : " + (a >= b));
        System.out.println(" Valor a < b: " + (a < b));
        System.out.println(" Valor a > b: " + (a > b));
        System.out.println("Valor a != b: " + (a != b));

        //String string
        System.out.println(" Valor s = s1 :" + (s == s1));
        //System.out.println(" Valor f <= g :" + (s <= s1));// Não se compara tamanho
        //System.out.println(" Valor f >= g : " + (s >= s1));// Não se compara tamanho
        //System.out.println(" Valor f < g :" + (s < s1));// Não se compara tamanho
        //System.out.println(" Valor f > g : " + (s > s1));// Não se compara tamanho
        System.out.println("Valor s != s1: " + (s != s1));
    }
}

