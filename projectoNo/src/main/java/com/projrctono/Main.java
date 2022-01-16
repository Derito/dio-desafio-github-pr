package com.projrctono;

public class Main {

    public static void main(String[] args) {
        No no1 = new No("conteudo no1");
        No no2 = new No("conteudo no2");
        no1.setProximono(no2);
        No no3 = new No("Conteudo do n3");
        no2.setProximono(no3);

        No no4 = new No("Conteudo no4");
        no3.setProximono(no4);

        System.out.println(no1);
        System.out.println(no1.getProximono());
        System.out.println(no2);

        System.out.println("------------");

        System.out.println(no1);
        System.out.println(no1.getProximono());
        System.out.println(no1.getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono().getProximono());


    }
}