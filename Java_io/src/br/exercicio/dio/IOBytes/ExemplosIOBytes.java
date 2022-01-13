package br.exercicio.dio.IOBytes;

import java.io.*;

public class ExemplosIOBytes {
    public static void main(String[] args) throws IOException{
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File file = new File("C:\\Users\\Hélder\\Documents\\Dev_Cod\\Git\\DIO\\dio-desafio-github-pr\\Java_io.javaIoStream\\recomendações-copy.txt");
        String nomeArquivo = file.getName();
        //InputStream is = new FileInputStream(file.getName());
        //BufferedInputStream bis = new BufferedInputStream(is);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file.getName()));

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");
        File fcopy = new File(nomeArquivoCopy);

        //OutputStream os = new FileOutputStream(nomeArquivoCopy);
        //BufferedOutputStream bos = new BufferedOutputStream(os);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));

        int linha = 0;
        while ((linha = bis.read()) != -1) {
            bos.write((char) linha);
            bos.flush();
        }
        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
            ps.printf("Arquivo %s copiado com sucesso e encontra-se no directorio %s com %d bytes.",
                fcopy.getName(),fcopy.getPath(),fcopy.length());
    }
}
