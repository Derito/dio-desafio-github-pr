package com.exercicio.dio;

public class Fila {
    private No refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    //Metodo enfileirar
    public void enqueue(No novoNo) {

        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    //Retorno do no
    public No first() {
        if (!this.isEmpty()) {
            No primerioNo = refNoEntrada;
            while (true) {
                if (primerioNo.getRefNo() != null) {
                    primerioNo = primerioNo.getRefNo();
                } else {
                    break;
                }
            }
            return primerioNo;
        }
        return null;
    }

    //Comporta-se como o first só que elimina o lemento da fila (desinfileirar)
    public No dequeue() {
        if (!this.isEmpty()) {
            No primerioNo = refNoEntrada;
            No noAuxiliar = refNoEntrada;
            while (true) {
                if (primerioNo.getRefNo() != null) {
                    noAuxiliar = primerioNo;
                    primerioNo = primerioNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primerioNo;
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntrada;
        if (refNoEntrada != null) {
            while (true) {
                stringRetorno += "[No{objecto=" + noAuxiliar.getObjecto() + "]}--->";
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
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
