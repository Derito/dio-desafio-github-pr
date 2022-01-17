package com.projrctono;

/*
*Usando Generics
 */
public class NoRefactorado<T> {

    private T conteudo;
    private NoRefactorado<T> proximono;

    public NoRefactorado(T conteudo) {
        this.proximono = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoRefactorado<T> getProximono() {
        return proximono;
    }

    public void setProximono(NoRefactorado<T> proximono) {
        this.proximono = proximono;
    }

    @Override
    public String toString() {
        return "NoRefactorado{" +
                "conteudo=" + conteudo +
                '}';
    }
}
