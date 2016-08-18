package testes;

import modelo.Eleitor;
import modelo.FachadaCartorioEleitoral;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEleitor {

    private Eleitor eleitor;
    private FachadaCartorioEleitoral cartorio;

    @Before
    public void setup() {
        cartorio = new FachadaCartorioEleitoral();
        //eleitor = new Eleitor("12345678901", "Joao", "123456789012");
    }

    @Test
    public void cadastraEleitor() {
        cartorio.cadastraEleitor("12345678901", "Joao", "123456789012");
        assertEquals(1, cartorio.numeroDeEleitores());
    }

}
