package com.projrctono;

public class MainRefatorado {
    public static void main(String[] args) {
        NoRefactorado<String> n1 = new NoRefactorado<>(" Conteudo no1");
        NoRefactorado<String> n2 = new NoRefactorado<>(" Conteudo no2");
        n1.setProximono(n2);
        NoRefactorado<String> n3 = new NoRefactorado<>(" Conteudo no3");
        n2.setProximono(n3);
        NoRefactorado<String> n4 = new NoRefactorado<>(" Conteudo no3");
        n3.setProximono(n4);

        System.out.println(n1);
        System.out.println(n1.getProximono());
        System.out.println(n1.getProximono().getProximono());
        System.out.println(n1.getProximono().getProximono().getProximono());
        System.out.println(n1.getProximono().getProximono().getProximono().getProximono());
    }
}
