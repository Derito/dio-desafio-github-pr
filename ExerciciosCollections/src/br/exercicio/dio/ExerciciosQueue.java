package br.exercicio.dio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/*
*  Trata de filas 1 a entrar 1 a sair
 * Permite somente adição, leitura e remoção
 */
public class ExerciciosQueue {

    public static void main(String[] args) {
        exercicios();
    }
    private static void exercicios(){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Helder");
        filaBanco.add("João");
        filaBanco.add("Luís");
        filaBanco.add("Fábio");
        filaBanco.add("Marcos");
        filaBanco.add("Filipe");

        System.out.println(filaBanco);

        //pool() retorna e remove o primeeiro da fila
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);
        //peek retorna e não remove retorna null quando a fila estiver vazia
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //clear limpa a lista
        //filaBanco.clear();
        //element retorna e não remove retorna erro quando a fila estiver vazia
        String primeiroClienteOuErro = filaBanco.element(); //Ocasiona erro fila vazia.
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String fila : filaBanco) {
            System.out.println(fila);
        }
        Iterator<String> filaBancoIterator = filaBanco.iterator();
        while (filaBancoIterator.hasNext()) {
            System.out.println(filaBancoIterator.next());
        }
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
        filaBanco.add("Joaozinho");
        System.out.println(filaBanco);

    }
}
