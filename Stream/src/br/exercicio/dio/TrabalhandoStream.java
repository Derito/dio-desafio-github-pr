package br.exercicio.dio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrabalhandoStream {
    public static void main(String[] args) {
        exercicioStream();
    }

    private static void exercicioStream() {
        //Mapping, Filtering, Foreach, Peek, Counting e Grouping
        List<String> alunosStrem = new ArrayList<>();

        alunosStrem.add("Jorge Afonso");
        alunosStrem.add("João");
        alunosStrem.add("Luís");
        alunosStrem.add("Hélcio");
        alunosStrem.add("Hélder");
        //Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + alunosStrem.stream().count());
        //Retorna o elemento com maior número de letras
        System.out.println("Maior número de letras: "+ alunosStrem.stream().max(Comparator.comparingInt(String::length)));
        //Retorna o elemento com menor número de letras
        System.out.println("Menor número de letras: "+ alunosStrem.stream().min(Comparator.comparingInt(String::length)));
        //Retorna os elementos que tenham a letra R
        System.out.println("Com a letra r: "+ alunosStrem.stream().filter((alunos)->alunos.toLowerCase().contains(
                "l")).collect(Collectors.toList()));
        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma colecção: "+ alunosStrem.stream().map(alunos->alunos.concat(
                " - ").concat(String.valueOf(alunos.length()))).collect(Collectors.toList()));
        //Retorna somente os 3 primeiros elementos da colecção
        System.out.println(alunosStrem.stream().limit(3).collect(Collectors.toList()));
        //Exibe cada elemento no console, e depois retorna a mesma colecção
        System.out.println(alunosStrem.stream().peek(System.out::println).collect(Collectors.toList()));
        //Exibe cada elemento no console sem retornar uma nova coleção
        System.out.println("Retorna os elementos novamente: ");
        alunosStrem.stream().forEach(System.out::println);
        System.out.println("Existe algum elemento com W no nome? : "+alunosStrem.stream().allMatch((aluno)-> aluno.contains("w")));
        //Retorna true caso agum nome tenha a letra e no nome
        System.out.println("Existe algum elemento com e no nome? : "+alunosStrem.stream().anyMatch((aluno)-> aluno.contains("e")));
        //Retorna true caso agum nome tenha a letra e no nome
        System.out.println("Existe algum elemento com a letra 'f' no nome? : "+alunosStrem.stream().noneMatch((aluno)-> aluno.contains("f")));
        //Retorna o primeiro elemento da coleção se existir retorna no console
        System.out.println("Retorna o primeiro elemento: ");
        alunosStrem.stream().findFirst().ifPresent(System.out::println);

        //Exemplos de operações encadeadas
        System.out.println("Operação encadeada: ");
        System.out.println(alunosStrem.stream()
                .peek(System.out::println)
                .map(aluno -> aluno.concat(" - ").concat(String.valueOf(aluno.length())) )
                .filter((aluno)->aluno.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
    }
}
