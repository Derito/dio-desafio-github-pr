package com.exercicio.dio;

public class No<T> {

    private T conteudo;
    private No proximono;

    public No() {
        this.proximono = null;
    }

    public No(T conteudo) {
        this.proximono = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximono) {
        this.conteudo = conteudo;
        this.proximono = proximono;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
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
                "conteudo=" + conteudo +
                '}';
    }
    public String toStringEncadeada() {
        String str = "No{" +
                "conteudo=" + conteudo +
                '}';
        if(proximono != null){
          str += "-->" + proximono.toString();
        }else{
        str += "--> null";
        }
        return str;
    }
}
