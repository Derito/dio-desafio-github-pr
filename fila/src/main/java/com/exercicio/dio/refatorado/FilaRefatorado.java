package com.exercicio.dio.refatorado;

import com.exercicio.dio.No;

public class FilaRefatorado<T> {
    private NoRefatorado<T> refNoEntrada;
    public FilaRefatorado() {
        this.refNoEntrada = null;
    }

    //Metodo enfileirar
    public void enqueue(T objeto) {
        //embutindo o No
        NoRefatorado novoNo = new NoRefatorado(objeto);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    //Retorno o Object
    public T first() {
        if (!this.isEmpty()) {
            NoRefatorado primerioNo = refNoEntrada;
            while (true) {
                if (primerioNo.getRefNo() != null) {
                    primerioNo = primerioNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primerioNo.getObjecto();
        }
        return null;
    }

    //Comporta-se como o first só que elimina o lemento da fila (desinfileirar)
    public T dequeue() {
        if (!this.isEmpty()) {
            NoRefatorado primerioNo = refNoEntrada;
            NoRefatorado noAuxiliar = refNoEntrada;
            while (true) {
                if (primerioNo.getRefNo() != null) {
                    noAuxiliar = primerioNo;
                    primerioNo = primerioNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primerioNo.getObjecto();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoRefatorado noAuxiliar = refNoEntrada;
        if (refNoEntrada != null) {
            while (true) {
                stringRetorno += "[NoRefatorado{objecto=" + noAuxiliar.getObjecto() + "]}--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += null;
                    break;
                }
            }
        } else {
            stringRetorno = null;
        }
        return stringRetorno;
    }
}
