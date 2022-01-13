package br.exercicio.dio;

import java.util.TreeMap;

public class ExerciciosTreeMap {
    public static void main(String[] args) {
        treeMapExemplos();
    }

    private static void treeMapExemplos() {

        TreeMap<String, String> verCidades = new TreeMap<>();
        //Monta a árvore com as cidades
        verCidades.put("LA", "Luanda");
        verCidades.put("CA", "Cabinda");
        verCidades.put("UG", "Uige");
        verCidades.put("HU", "Huambo");
        verCidades.put("LB", "Lubango");

        System.out.println(verCidades);
        //Retorna a primeira cidade no topo da árvore.
        System.out.println(verCidades.firstKey());
        //retorna a ultima cidade no final da árvore
        System.out.println(verCidades.lastKey());
        //Retorna a primeira cidade abaixo da cidade parametrizada
        System.out.println(verCidades.lowerKey("UG"));
        //Retorna a primeira cidade acima da cidade parametrizada
        System.out.println(verCidades.higherKey("UG"));
        //Exibe tudo
        System.out.println(verCidades);
        //Retorna a primeira cidade no topo da árvore
        System.out.println(verCidades.firstEntry().getKey()+"---"+ verCidades.firstEntry().getValue());




    }
}
