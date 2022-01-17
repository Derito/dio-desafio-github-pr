package com.exercicio.dio;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> refPrimeiro;
    private NoDuplo<T> refUltimo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.refPrimeiro = null;
        this.refUltimo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setRefProximo(null);
        novoNo.setRefPrevio(refUltimo);
        if (refPrimeiro == null) {
            refPrimeiro = novoNo;
        }
        if (refUltimo != null) {
            refUltimo.setRefProximo(novoNo);
        }
        refUltimo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> refAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setRefProximo(refAuxiliar);

        if (novoNo.getRefProximo() != null) {
            novoNo.setRefPrevio(refAuxiliar.getRefPrevio());
            novoNo.getRefProximo().setRefPrevio(novoNo);

        } else {
            novoNo.setRefPrevio(refUltimo);
            refUltimo = novoNo;
        }
        if (index == 0) {
            refPrimeiro = novoNo;
        } else {
            novoNo.getRefPrevio().setRefProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            refPrimeiro = refPrimeiro.getRefProximo();
            if (refPrimeiro != null) {
                refPrimeiro.setRefPrevio(null);
            }
        } else {
            NoDuplo<T> refAuxiliar = getNo(index);
            refAuxiliar.getRefPrevio().setRefProximo(refAuxiliar.getRefProximo());
            if (refAuxiliar != refUltimo) {
                refAuxiliar.getRefProximo().setRefPrevio(refAuxiliar.getRefPrevio());
            } else {
                refUltimo = refAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> refAuxiliar = refPrimeiro;
        for (int i = 0; (i < index) && (refAuxiliar != null); i++) {
            refAuxiliar = refAuxiliar.getRefProximo();
        }
        return refAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> refAuxiliar = refPrimeiro;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + refAuxiliar.getConteudo() + "}]---->";
            refAuxiliar = refAuxiliar.getRefProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
