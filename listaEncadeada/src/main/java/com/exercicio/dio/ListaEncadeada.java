package com.exercicio.dio;

public class ListaEncadeada<T> {

    private No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            refEntrada = novoNo;
            return;
        }
        No<T> refAuxiliar = refEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            refAuxiliar = refAuxiliar.getProximono();
        }
        refAuxiliar.setProximono(novoNo);
    }
    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {

        validaIndex(index);//Usando o metodo para avalidar o index
        No<T> refAuxiliar = refEntrada;
        No<T> refRetorno = null;
        for (int i = 0; i <= index; i++) {
            refRetorno = refAuxiliar;
            refAuxiliar = refAuxiliar.getProximono();
        }
        return refRetorno;
    }
    public T remove (int index){
        No<T> refPivo = this.getNo(index);
        if(index == 0){
            refEntrada = refPivo.getProximono();
            return refPivo.getConteudo();
        }
        No<T> refAnterior = getNo(index -1);
        refAnterior.setProximono(refPivo.getProximono());
        return refPivo.getConteudo();

    }

    public int size() {
        int tamanhoLista = 0;
        No<T> refAuxiliar = refEntrada;
        while (true) {
            if (refAuxiliar != null) {
                tamanhoLista++;
                if (refAuxiliar.getProximono() != null) {
                    refAuxiliar = refAuxiliar.getProximono();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return refEntrada == null ? true : false;
    }

    private void validaIndex(int index) {
        if (index >= size()) {
            int ultimoIndex = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no index " + index + "desta lista. Esta lista termina com o indice " + ultimoIndex + ".");
        }
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> refAuxiliar = refEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" +refAuxiliar.getConteudo() + "}]--->";
            refAuxiliar =refAuxiliar.getProximono();
        }
        strRetorno += "null";
        return strRetorno;

    }
}
