package one.digitalinnovation;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setnoProximo(cauda);
        }else{
            novoNo.setnoProximo(this.cauda);
            this.cabeca.setnoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }
    public void remove(int index){
        if (index >= tamanhoLista)
            throw new IndexOutOfBoundsException("Index maior que o tamanho da lista");
        No<T> noAuxiliar = this.cauda;
        if (index == 0){
            this.cauda = this.cauda.getnoProximo();
            this.cabeca.setnoProximo(this.cauda);
        }else if (index == 1){
            this.cauda.setnoProximo(this.cauda.getnoProximo().getnoProximo());
        }else{
            for (int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getnoProximo();
            }
            noAuxiliar.setnoProximo(noAuxiliar.getnoProximo().getnoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    private No<T> getNo(int index){
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia.");
        if (index == 0){
            return cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getnoProximo();
        }
        return noAuxiliar;
    }
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++){
            strRetorno += "[No{Conteudo=" + noAuxiliar.getConteudo() + "}]-->";
            noAuxiliar = noAuxiliar.getnoProximo();
        }

        strRetorno += this.size() != 0 ?"(Retorna ao início)" : "[]";
        return strRetorno;
    }
}
