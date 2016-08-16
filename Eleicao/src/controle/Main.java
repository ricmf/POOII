package controle;

import excecoes.ExcecaoZonaEleitoralExistente;
import modelo.Candidato;
import modelo.FachadaCartorioEleitoral;
import visao.GUI;

public class Main {

    private static Object FachadaCartorio;

    public static void main(String[] args) {
        FachadaCartorioEleitoral cartorio = new FachadaCartorioEleitoral();
        try{
            cartorio.cadastraZonaEleitoral(101, "Estreito");
            System.out.println("Numero de zonas cadastradas: " + cartorio.numeroDeZonasEleitorais());
            cartorio.cadastraZonaEleitoral(101, "Estreito");
            System.out.println("Numero de zonas Cadastradas: " + cartorio.numeroDeZonasEleitorais());
        }
        catch (ExcecaoZonaEleitoralExistente e){
               System.out.println("Gerou exceção!");
        }
       
    }
}
