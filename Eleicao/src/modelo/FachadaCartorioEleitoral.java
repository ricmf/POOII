package modelo;

import excecoes.ExcecaoZonaEleitoralExistente;
import java.util.ArrayList;
import visao.GUI;

public class FachadaCartorioEleitoral {

    private ArrayList<ZonaEleitoral> zonas;
    private ArrayList<Secao> secoes;
    private ArrayList<Eleitor> eleitores;
    private ArrayList<Partido> partidos;

    public FachadaCartorioEleitoral() {
        this.zonas = new ArrayList<ZonaEleitoral>();
        this.secoes = new ArrayList<Secao>();
        this.eleitores = new ArrayList<Eleitor>();
        this.partidos = new ArrayList<Partido>();
    }

    public void cadastraZonaEleitoral(int numeroZonaEleitoral, String localizacao) throws ExcecaoZonaEleitoralExistente {
        ZonaEleitoral zonaExistente = getZona(numeroZonaEleitoral);
        if (zonaExistente == null) {
            ZonaEleitoral zonaNova = new ZonaEleitoral(numeroZonaEleitoral, localizacao);
            this.zonas.add(zonaNova);
        } else {
            throw new ExcecaoZonaEleitoralExistente();
        }
    }

    public ZonaEleitoral getZona(int numeroZonaEleitoral) {
        for (int i = 0; i < this.zonas.size(); i++) {
            ZonaEleitoral zona = this.zonas.get(i);
            if (zona.getNumero() == numeroZonaEleitoral) {
                return zona;
            }
        }
        return null;
    }

    public int numeroDeZonasEleitorais() {
        return this.zonas.size();
    }

    public int cadastraSecao(int numeroZonaEleitoral) {
        ZonaEleitoral zona = getZona(numeroZonaEleitoral);
        if (zona != null) {
            return zona.criaNovaSecao();
        } else {
            return 0;
        }
    }

    public int numeroDeSecoes() {
        return this.secoes.size();
    }

    public Secao getSecao(int numeroSecao) {
        for (int i = 0; i < this.secoes.size(); i++) {
            Secao secao = this.secoes.get(i);
            if (secao.getNumero() == numeroSecao) {
                return secao;
            }
        }
        return null;
    }

    public void cadastraEleitor(String cpf, String nome, String titulo) {
        Eleitor eleitorExistente = getEleitor(cpf);
        if (eleitorExistente == null) {
            Eleitor eleitorNovo = new Eleitor(cpf, nome, titulo);
            this.eleitores.add(eleitorNovo);
        }
    }

    public Eleitor getEleitor(String cpf) {
        for (int i = 0; i < this.eleitores.size(); i++) {
            Eleitor eleitor = this.eleitores.get(i);
            if (eleitor.getCpf().equals(cpf)) {
                return eleitor;
            }
        }
        return null;
    }

    public int numeroDeEleitores() {
        return this.eleitores.size();
    }

    public void cadastraPartido(String siglaPartido, String nomePartido) {
        Partido partido = getPartido(siglaPartido);
        if (partido == null) {
            partido = new Partido(siglaPartido, nomePartido);
            this.partidos.add(partido);

        }
    }

    public Partido getPartido(String siglaPartido) {
        for (int i = 0; i < this.partidos.size(); i++) {
            Partido partido = this.partidos.get(i);
            if (partido.getSiglaPartido().equals(siglaPartido)) {
                return partido;
            }
        }
        return null;
    }

    public boolean verifica (int numero) {
        return zonas.contains(numero);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
