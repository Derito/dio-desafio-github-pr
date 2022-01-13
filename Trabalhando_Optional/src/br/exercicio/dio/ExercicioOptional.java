package br.exercicio.dio;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExercicioOptional {
    public static void main(String[] args) {
        //trabalhandoOptional();
        trabalhandoOptionalPrimitivo();
    }

    private static void trabalhandoOptional() {

        //A expressão (valor)->System.out.println(valor) é o mesmo que System.out:: println
        Optional<String> optionalString = Optional.of("Valor Presente!");
        System.out.println("valor optional que esta presente.");
        optionalString.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("Não esta presente!"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("valor optional que não esta presente.");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Null - Não esta presente!"));

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("valor optional que não esta presente.");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Empty - Não esta presente!"));

        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("valor optional que lança nullpoitException");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Erro - Não esta presente!"));

    }

    private static void trabalhandoOptionalPrimitivo() {

        System.out.println("***Valor inteiro optional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor double optional***");
        OptionalDouble.of(12.6).ifPresent(System.out::println);

        System.out.println("***Valor long optional***");
        OptionalLong.of(12L).ifPresent(System.out::println);
    }

    private static void exemplOptional(){
        Optional<String> optionalString = Optional.of("Valor optional");

        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.isPresent(System.out :: println,()-> System.out.println("Valor não esta presente."));
        if(optionalString.isPresent()){
            String valor = optionalString.get();
            System.out.println(valor);
        }
optionalString.map((valor) -> valor.concat("*****")).isPresent(System.out::println);
        optionalString.orElseThrow(IllegalStateException::new);
    }
}
