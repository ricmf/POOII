package modelo;

import java.util.ArrayList;

public class Partido {

    private String nomePartido;
    private String siglaPartido;
    private ArrayList<Candidato> vereadores;
    private Candidato prefeito;

    public Partido(String siglaPartido, String nomePartido) {
        this.nomePartido = nomePartido;
        this.siglaPartido = siglaPartido;
        this.vereadores = new ArrayList<Candidato>();
    }

    public void setPrefeito(Candidato prefeito) {
        this.prefeito = prefeito;
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public String getSiglaPartido() {
        return siglaPartido;
    }

    public ArrayList<Candidato> getVereadores() {
        return vereadores;
    }

    public Candidato getPrefeito() {
        return prefeito;
    }

    public void insereVereador(Candidato vereador) {
        if (!this.vereadores.contains(vereador)) {
            this.vereadores.add(vereador);
        }
    }

    public int numeroDeVereadores() {
        return this.vereadores.size();
    }
    
    /* public void inserePrefeito(Candidato prefeito) {
     if (!this.prefeito.equals(prefeito)) {
     this.prefeito = prefeito;
     }
     } */
}
