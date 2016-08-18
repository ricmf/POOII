package excecoes;

public class ExcecaoZonaEleitoralExistente extends Exception {

    private static final long serialVersionUID = 1L;

    public ExcecaoZonaEleitoralExistente() {
    }

    public ExcecaoZonaEleitoralExistente(String msg) {
        super(msg);
    }
    
}