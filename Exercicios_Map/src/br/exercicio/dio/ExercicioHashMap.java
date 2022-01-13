package br.exercicio.dio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercicioHashMap {
    public static void main(String[] args) {
        hashMapExemplos();
    }
    private static void hashMapExemplos(){
        Map<String, Integer> campeosMundialFifa = new HashMap<>();
        //Pode usar-se na forma abaixo
        Map<String, List<Integer>> campeosMundialFifa2 = new HashMap<>();

        campeosMundialFifa.put("Brasil", 5);
        campeosMundialFifa.put("Alemanha", 4);
        campeosMundialFifa.put("Itália", 4);
        campeosMundialFifa.put("Uruguai", 2);
        campeosMundialFifa.put("Argentina", 2);
        campeosMundialFifa.put("França", 2);
        campeosMundialFifa.put("Inglaterra", 1);
        campeosMundialFifa.put("Espanha", 1);

        System.out.println(campeosMundialFifa);
        //Atualiza o valor para a chave Brasil
        campeosMundialFifa.put("Brasil",6);
        System.out.println(campeosMundialFifa);
        //Retorna a chave da Argentina
        System.out.println(campeosMundialFifa.get("Argentina"));
        //Retorna boolean (true ou false) se existe ou não o campeão França
        System.out.println(campeosMundialFifa.containsKey("França"));
        //Remove o campeão França
        campeosMundialFifa.remove("França");
        //Retorna boolean(true ou false) se existe ou não capeão França
        System.out.println(campeosMundialFifa.containsKey("França"));
        //Retorna se existe ou não alguma selecção hexa-campeã
        System.out.println(campeosMundialFifa.containsValue(6));
        //retorna o tamanho do mapa
        System.out.println(campeosMundialFifa.size());
        System.out.println(campeosMundialFifa);

        //Navega nos registros do mapa
        for(Map.Entry<String,Integer> entrada :campeosMundialFifa.entrySet()){
            System.out.println("----> " + entrada);
        }
        //Navega nos registros do mapa por chave
        for(String chave : campeosMundialFifa.keySet()){
            System.out.println(chave + " --- "+ campeosMundialFifa.get(chave));
        }
        System.out.println(campeosMundialFifa);
        //Verifica se o mapa contem a chave Estados Unidos retorna bollean (true ou false)
        System.out.println(campeosMundialFifa.containsKey("Estados Unidos"));
        //Verifica se o mapa possui a chave 5 retorna boolean (true ou false)
        System.out.println(campeosMundialFifa.containsValue(5));
        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeosMundialFifa.size());
        campeosMundialFifa.clear();
        System.out.println(campeosMundialFifa.size());

    }
}
