package com.exercicio.dio;

public class Pilha {
    private No refPilha;

    public Pilha() {
        this.refPilha = null;
    }

    //Empilha um novo no
    public void push(No novoNo) {
        No refAuxiliar = refPilha;
        refPilha = novoNo;
        refPilha.setRefNo(refAuxiliar);
    }

    //Exclui o ultimo elemento no acima
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refPilha;
            refPilha = refPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    //Verifica o no existente no topo
    public No top() {
        return refPilha;
    }

    //Verifica a existencia de nos
    public boolean isEmpty() {

        // if (refPilha == null) {
        //   return true;
        // }
        //return false;
        return refPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "----------\n";

        No noAuxiliar = refPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "-----------\n";
        return stringRetorno;
    }
}
