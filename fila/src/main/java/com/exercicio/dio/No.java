package com.exercicio.dio;

public class No {

    private Object objecto;
    private No refNo;

    public No() {
    }

    public No(Object objecto) {
        this.refNo = null;
        this.objecto = objecto;
    }

    public Object getObjecto() {
        return objecto;
    }

    public void setObjecto(Object objecto) {
        this.objecto = objecto;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "objecto=" + objecto +
                '}';
    }
}
