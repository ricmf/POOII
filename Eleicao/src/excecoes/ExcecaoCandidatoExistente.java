package excecoes;

public class ExcecaoCandidatoExistente extends Exception {

    private static final long serialVersionUID = 1L;

    public ExcecaoCandidatoExistente() {
    }

    public ExcecaoCandidatoExistente(String msg) {
        super(msg);
    }
    
}