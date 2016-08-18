package testes;

import excecoes.ExcecaoZonaEleitoralExistente;
import modelo.Candidato;
import modelo.Eleitor;
import static org.junit.Assert.*;

import modelo.FachadaCartorioEleitoral;
import modelo.Partido;
import modelo.Secao;
import modelo.ZonaEleitoral;

import org.junit.Before;
import org.junit.Test;

public class TesteZonaEleitoral {

    private FachadaCartorioEleitoral cartorio;
    // private Candidato candidato;
    // private Secao secao;
    // private Partido partido;
    // private ZonaEleitoral zona;

    @Before
    public void setup() {
        cartorio = new FachadaCartorioEleitoral();
    }

    @Test
    public void cadastraZona101DuasVezes() throws ExcecaoZonaEleitoralExistente {
        cartorio.cadastraZonaEleitoral(101, "Estreito");
        assertEquals(1, cartorio.numeroDeZonasEleitorais());
        ZonaEleitoral zona0 = cartorio.getZona(101);
        assertEquals(101, zona0.getNumero());

        cartorio.cadastraZonaEleitoral(101, "Estreito");
        assertEquals(1, cartorio.numeroDeZonasEleitorais());
    }

    @Test
    public void cadastraZona101E102() throws ExcecaoZonaEleitoralExistente {

        cartorio.cadastraZonaEleitoral(101, "Estreito");
        assertEquals(1, cartorio.numeroDeZonasEleitorais());
        ZonaEleitoral zona0 = cartorio.getZona(101);
        assertEquals(101, zona0.getNumero());

        cartorio.cadastraZonaEleitoral(101, "Estreito");
        assertEquals(1, cartorio.numeroDeZonasEleitorais());

        cartorio.cadastraZonaEleitoral(102, "Centro");
        assertEquals(2, cartorio.numeroDeZonasEleitorais());
        ZonaEleitoral zona1 = cartorio.getZona(102);
        assertEquals(102, zona1.getNumero());
    }

    @Test
    public void cadastraSecao() {
        cartorio.cadastraSecao(1);
        assertEquals(1, cartorio.numeroDeSecoes());
    }


}
