package br.exercicio.dio.IOCharacters;

import java.io.File;
import java.util.Scanner;

public class ExemploFile {
    public static void main(String[] args) {
        File f = new File("Meu programa.txt");
        System.out.println("Nome do arquivo: "+ f.getName());
        System.out.println("Caminho do arquivo: "+ f.getPath());
        System.out.println("Caminho absoluto do arquivo: "+ f.getAbsolutePath());
        System.out.println("Diretorio pai do arquivo: "+ f.getParent());
        System.out.println("Se existe o arquivo: "+ f.exists());
        System.out.println("Pode ser lido o arquivo: "+ f.canRead());
    }
    private static void filme(){
        Scanner scanner = new Scanner(System.in);
        int filme = scanner.nextInt();

        System.out.println(filme);

    }
}
