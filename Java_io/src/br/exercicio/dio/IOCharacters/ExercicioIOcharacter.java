package br.exercicio.dio.IOCharacters;

import java.io.*;

public class ExercicioIOcharacter {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File file = new File("C:\\Users\\Hélder\\Documents\\Dev_Cod\\Git\\DIO\\dio-desafio-github-pr\\Java_io.javaIoStream\\recomendações.txt");
        String nomeArquivo = file.getName();
        //Reader r = new FileReader(nomeArquivo);
        //BufferedReader br = new BufferedReader(r);
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String linha = br.readLine();

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nomeArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        } while (linha != null);
        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com tamanho: '%d' bytes.\n ", file.getName(), file.length());
        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com tamanho: '%d' bytes.", fcopy.getName(), fcopy.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomente 3 livros: ");
        pw.flush();

        adicionarInformacaoArquivo(fcopy.getName());

       pw.printf("Informação escrita com sucesso! '%d' bytes.",fcopy.length());

       pw.close();
       br.close();
       pw.close();

    }

    public static void adicionarInformacaoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha2 = br.readLine();

        BufferedWriter bwr = new BufferedWriter(new FileWriter(arquivo,true));

        do{
            bwr.write(linha2);
            bwr.newLine();
            linha2 = br.readLine();
        }while(!(linha2.equalsIgnoreCase("fim")));

        br.close();
        bwr.close();
    }
}
