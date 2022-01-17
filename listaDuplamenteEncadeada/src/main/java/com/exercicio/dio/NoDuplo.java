package com.exercicio.dio;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> refProximo;
    private NoDuplo<T> refPrevio;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getRefProximo() {
        return refProximo;
    }

    public void setRefProximo(NoDuplo<T> refProximo) {
        this.refProximo = refProximo;
    }

    public NoDuplo<T> getRefPrevio() {
        return refPrevio;
    }

    public void setRefPrevio(NoDuplo<T> refPrevio) {
        this.refPrevio = refPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
