package br.exercicio.dio.IOData;

import java.io.*;
import java.util.Scanner;

public class ExerciciosIOData {
    public static void main(String[] args) throws IOException {
        incluirproduto();
    }

    public static void incluirproduto() throws IOException {

        File f = new File("C:\\Users\\Hélder\\Documents\\Dev_Cod\\Git\\DIO\\doc\\peca_de_roupa.docx");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        //OutputStream os = new FileOutputStream(f.getPath());
        //DataOutputStream dos = new DataOutputStream(os);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);
        ps.print("Nome da peça: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.print("Tamanho da peça (P/M/G/U)");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.print("Quantidade ");
        int quantidade = scan.nextInt();
        dos.writeInt(quantidade);

        //Inserir valores separado por virgula
        ps.print("Preço unitário: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        ps.printf("O arquivo %s foi criado com %d bytes no directorio '%s'. \n ",
                f.getName(), f.length(), f.getAbsolutePath());

        lerProduto(f.getPath());

        dos.close();
        scan.close();
        ps.close();
    }

    public static void lerProduto(String caminhoArquivo) throws IOException {

        File fi = new File(caminhoArquivo);

        // InputStream is = new FileInputStream(fi.getPath());
        //DataInputStream dis = new DataInputStream(is);
        DataInputStream dis = new DataInputStream(new FileInputStream(fi.getPath()));
        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome:.........: \n"+nome);
        System.out.printf("\nTamanho:.........: \n"+tamanho);
        System.out.printf("\nquantidade:.........: \n"+quantidade);
        System.out.printf("\nPreço:.........: \n"+preco);
        System.out.printf("\nTotal do valor das peças: "+quantidade * preco+" Kwanzas");

        dis.close();
    }
}
