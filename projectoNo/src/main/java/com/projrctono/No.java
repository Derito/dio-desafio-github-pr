package com.projrctono;

public class No {

    private String conteudo;
    private No proximono;

    public No(String conteudo) {
        this.proximono = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximono() {
        return proximono;
    }

    public void setProximono(No proximono) {
        this.proximono = proximono;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
