package com.exercicio.dio.refatorado;

public class NoRefatorado<T> {

    private T objecto;
    private NoRefatorado refNo;

    public NoRefatorado() {
    }

    public NoRefatorado(T objecto) {
        this.refNo = null;
        this.objecto = objecto;
    }

    public T getObjecto() {
        return objecto;
    }

    public void setObjecto(T objecto) {
        this.objecto = objecto;
    }

    public NoRefatorado getRefNo() {
        return refNo;
    }

    public void setRefNo(NoRefatorado refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "NoRefatorado{" +
                "objecto=" + objecto +
                '}';
    }
}
