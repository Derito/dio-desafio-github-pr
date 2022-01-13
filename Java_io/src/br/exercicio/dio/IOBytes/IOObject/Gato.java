package br.exercicio.dio.IOBytes.IOObject;

import java.io.Serializable;

public class Gato implements Serializable {

    private static final long serialVersionUID = 1L;
    //Caso adicione uma nova variavel devera usar transient para não alterar a vesão serializeble
    String nome;
    Integer idade;
    String cor;
    boolean castrado;

    public Gato() {
    }

    public Gato(String nome, Integer idade, String cor,boolean castrado) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.castrado = castrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", castrado=" + castrado +
                '}';
    }

}
