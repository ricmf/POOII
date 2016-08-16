package modelo;

import java.util.ArrayList;

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

    public void cadastraZonaEleitoral(int numeroZonaEleitoral, String localizacao) {
        ZonaEleitoral zona = getZona(numeroZonaEleitoral);
        if (zona == null) {
            zona = new ZonaEleitoral(numeroZonaEleitoral, localizacao);
            this.zonas.add(zona);
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

    public int numeroDeSecao() {
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

    public void cadastraEleitor(int cpf, String nome, int titulo) {
        Eleitor eleitor = getEleitor(cpf);
        if (eleitor == null) {
            eleitor = new Eleitor(cpf, nome, titulo);
            this.eleitores.add(eleitor);
        }
    }

    public Eleitor getEleitor(int cpf) {
        for (int i = 0; i < this.eleitores.size(); i++) {
            Eleitor eleitor = this.eleitores.get(i);
            if (eleitor.getCpf() == cpf) {
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

}
