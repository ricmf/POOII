package testes;

import excecoes.ExcecaoZonaEleitoralExistente;
import modelo.FachadaCartorioEleitoral;
import modelo.ZonaEleitoral;

public class TesteCartorioEleitoral {
	public static void main(String[] args) {

		FachadaCartorioEleitoral cartorio = new FachadaCartorioEleitoral();
		
		try{
		cartorio.cadastraZonaEleitoral(101, "Estreito");
		ZonaEleitoral zona0 = cartorio.getZona(101);
		System.out.println("Número da zona: " + zona0.getNumero());
		System.out.println("Quantidade de zonas: "
				+ cartorio.numeroDeZonasEleitorais());
		cartorio.cadastraZonaEleitoral(101, "Estreito");
		System.out.println("Quantidade de zonas: "
				+ cartorio.numeroDeZonasEleitorais());
		}
		catch(ExcecaoZonaEleitoralExistente e) {
			System.out.println("Gerou exceção!");			
		}
        }
}