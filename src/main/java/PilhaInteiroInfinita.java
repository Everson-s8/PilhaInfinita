public class PilhaInteiroInfinita extends PilhaSequencial<Integer>{
    public PilhaInteiroInfinita(Class<Integer> dataType) {
        super(dataType);
    }

    @Override
    public void empilhar(Integer valor) throws PilhaCheiaException {
        aumentarCapacidade();
        super.empilhar(valor);
    }

    @Override
    public Integer desempilhar() throws PilhaVaziaException {
        return super.desempilhar();
    }

    @Override
    public boolean estahVazia() {
        return super.estahVazia();
    }

    @Override
    public Integer getTopo() throws PilhaVaziaException {
        return super.getTopo();
    }

    @Override
    public int getQtd() {
        return super.getQtd();
    }

    @Override
    public void aumentarCapacidade() {
        super.aumentarCapacidade();
    }
}
