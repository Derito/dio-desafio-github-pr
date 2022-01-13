package br.exercicio.dio.IOCharacters;

import java.io.*;
import java.util.Scanner;

public class Exercicio1IOCharacter {
    public static void main(String[] args) throws IOException {
        //receberDadosImprimir();
        lerTecladoEscreverDocumento();
    }

    public static void receberDadosImprimir() throws IOException {
        //InputStream entrada = System.in;
        //InputStreamReader melhora = new InputStreamReader(entrada);
        // BufferedReader reader = new BufferedReader(melhora);

        //Usando o padarão decoreitor
        System.out.println("Recomende 3 filmes! ");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        String linha = rd.readLine();

        //OutputStream out = System.out;
        //OutputStreamWriter osw = new OutputStreamWriter(out);
        //BufferedWriter bw = new BufferedWriter(osw);

        //Impressão de valores usando decoreitor
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(linha);
            bw.newLine();
            linha = rd.readLine();
        } while (!(linha.isEmpty()));
        bw.flush(); //Descarrega e controla o fluxo

        //Fecha o fluxo
        rd.close();
        bw.close();
    }
    public static void lerTecladoEscreverDocumento() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        //Flush para descarregar
        pw.flush();

        //Abre o teclado
        Scanner scan = new Scanner(System.in);
        String linha = scan.nextLine();

        //Criar o documento
        File f = new File("recomendações.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do{
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = scan.nextLine();

        }while (!(linha.equalsIgnoreCase("fim")));
        pw.printf("Arquivo \"%s\" foi criado com sucesso! ", f.getName());

        pw.close();
        scan.close();
        bw.close();
    }
}
