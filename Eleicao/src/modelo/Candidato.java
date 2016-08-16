package modelo;
import modelo.Eleitor;

public class Candidato {

    private Partido partido;
    private int numeroCampanha;

    public Candidato(int numeroCampanha) {
        this.numeroCampanha = numeroCampanha;
    }

    public int getNumeroCampanha() {
        return numeroCampanha;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

}
