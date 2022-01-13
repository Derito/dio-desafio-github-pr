package br.exercicio.dio.IOBytes.IOObject;

import java.io.*;

public class ExercicoIOObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Obriga a serialização da classe gato
        //serializacao();
        descerializacao("C:\\Users\\Hélder\\eclipse-workspace\\javaIoStream\\gato");

    }
    public static void serializacao() throws IOException {
        Gato gato = new Gato("Simba",6,"Cinza",true);

        File f = new File("gato");

        //OutputStream os = new FileOutputStream(f.getName());
        //ObjectOutputStream oos = new ObjectOutputStream(os);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));
        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! tamanho '%d' bytes", f.getPath(),f.length());

        oos.close();
        ps.close();

    }
    public static void descerializacao(String arquivo) throws IOException, ClassNotFoundException {

        //InputStream in = new FileInputStream(arquivo);
        //ObjectInputStream ois = new ObjectInputStream(in);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objectoGato = (Gato)ois.readObject();

        System.out.printf("\nNome............: %s\n", objectoGato.getNome());
        System.out.printf("Idade............: %d\n",objectoGato.getIdade());
        System.out.printf("Cor............: %s\n", objectoGato.getCor());
        System.out.printf("Castrado............: %s\n", objectoGato.isCastrado());
        System.out.println(objectoGato);

        ois.close();


    }
}
