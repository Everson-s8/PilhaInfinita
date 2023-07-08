public class PilhaSequencial<T> implements IPilha<T>{

    private T[] dados;
    private int max;

    private int tamanho;
    private int top;
    public PilhaSequencial(Class<T> dataType){
        this.max = 10;
        this.dados = (T[]) java.lang.reflect.Array.newInstance(dataType, this.max);
    }

    @Override
    public void empilhar(T valor) throws PilhaCheiaException {
        if (tamanho == max){
            throw new PilhaCheiaException("a pilha está cheia");
        }
        dados[top] = valor;
        top++;
        tamanho++;
    }

    @Override
    public T desempilhar() throws PilhaVaziaException {
        if (tamanho == 0 ){
            throw new PilhaVaziaException("pilha está vazia");
        }

        T removido = dados[top-1];
        dados[top-1] = null;
        top--;
        tamanho--;
        return removido;
    }

    @Override
    public T getTopo() throws PilhaVaziaException {
        if (tamanho == 0){
            throw new PilhaVaziaException("pilha está vazia");
        }
        return dados[top-1];
    }

    @Override
    public int getQtd() {
        return tamanho;
    }

    @Override
    public boolean estahVazia() {
        if (tamanho == 0){
            return true;
        }
        return false;
    }

    public void aumentarCapacidade(){
        if (tamanho == max){
        T vetorAux[] = (T[]) new Object[max * 2];
            for (int i = 0; i < dados.length; i++) {
                vetorAux[i] = dados[i];
            }
            this.dados = vetorAux;
            max = max*2;
        }
    }
}
