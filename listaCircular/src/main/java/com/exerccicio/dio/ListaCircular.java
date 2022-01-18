package com.exerccicio.dio;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setRefProximoNo(cauda);
        } else {
            novoNo.setRefProximoNo(this.cauda);
            this.cabeca.setRefProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O index é maior que o tamanho da lista!");
        No<T> refAuxiliar = this.cauda;
        if (index < 0) {
            this.cauda = this.cauda.getRefProximoNo();
            this.cabeca.setRefProximoNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setRefProximoNo(this.cauda.getRefProximoNo().getRefProximoNo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                refAuxiliar = refAuxiliar.getRefProximoNo();
            }
            refAuxiliar.setRefProximoNo(refAuxiliar.getRefProximoNo().getRefProximoNo());
        }
        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista esta vazia!");
        }
        if (index == 0) {
            return this.cauda;
        }
        No<T> refAuxiliar = cauda;
        for (int i = 0; (i < index) && (refAuxiliar != null); i++) {
            refAuxiliar = refAuxiliar.getRefProximoNo();
        }
        return refAuxiliar;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> refAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo = " + refAuxiliar.getRefProximoNo() + "}]--->";
            refAuxiliar = refAuxiliar.getRefProximoNo();
        }
strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";
        return strRetorno;
    }
}
