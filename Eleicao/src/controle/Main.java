package controle;

import excecoes.ExcecaoCandidatoExistente;
import excecoes.ExcecaoZonaEleitoralExistente;
import java.util.ArrayList;
import modelo.Candidato;
import modelo.Eleitor;
import modelo.FachadaCartorioEleitoral;
import modelo.ZonaEleitoral;
import testes.TesteEleitor;
import visao.GUI;

public class Main {
    
    private static Object FachadaCartorio;
    
    public static void main(String[] args) {
        boolean loopFlag = true;
        FachadaCartorioEleitoral cartorio = new FachadaCartorioEleitoral();
        ArrayList<ZonaEleitoral> zonas;
        /*try {
         cartorio.cadastraZonaEleitoral(101, "Estreito");
         System.out.println("Numero de zonas cadastradas: " + cartorio.numeroDeZonasEleitorais());
         cartorio.cadastraZonaEleitoral(101, "Estreito");
         System.out.println("Numero de zonas Cadastradas: " + cartorio.numeroDeZonasEleitorais());
         } catch (ExcecaoZonaEleitoralExistente e) {
         System.out.println("Gerou exceção!");
         } */


        /* Eleitor eleitor = new Eleitor("12345678901", "Joao", "123456789012");
         TesteEleitor teste = new TesteEleitor();
         teste.cadastraEleitor();
        
         try{
         cartorio.cadastraEleitor("12345678901", "Joao", "123456789012");
         System.out.println("Numero de eleitores cadastrados: " + cartorio.numeroDeEleitores());
         cartorio.cadastraEleitor("12345678901", "Joao", "123456789012");
         System.out.println("Numero de eleitores cadastrados: " + cartorio.numeroDeEleitores());
         }
         catch (ExcecaoCandidatoExistente b) {
         System.out.println("Gerou exceção");
         } */
        while (loopFlag) {
            
            int flag = GUI
                    .inputInt("============================================\n"
                            + "Digite o número correspondente à operação desejada:\n"
                            + "============================================\n"
                            + "0 - Cancelar\n" + "1 - Votar\n"
                            + "Z - XXXXXX\n"
                            + "Z - XXXX\n" + "Z - XXXX\n"
                            + "============================================\n"
                            + "Opções de Administrador:\n"
                            + "2 - Cadastrar Seção\n"
                            + "3 - Cadastrar Eleitor\n"
                            + "4 - Cadastrar Zona Eleitoral\n"
                            + "5 - Cadastrar Partido\n"
                            + "6 - Cadastrar Candidato\n"
                            + "7 - Verificar Cadastros\n");
            
            switch (flag) {
                case 0:
                    loopFlag = false;
                    break;
                
                case 1:
                    Votar();
                    break;
                
                case 5:
                    registraPartidos();
                    break;
                
                case 3:
                    registraEleitor();
                    break;
                
                case 6:
                    registraCandidato();
                    break;
                
                case 4:
                    registraZonaEleitoral();
                    break;
                
                case 2:
                    registraSecao();
                    break; 
                    case 7:
                        
                    verificarCadastros();
                    break; 
            }
        }
    }
    
    public static void registraEleitor() {
        String masterPassAttempt = GUI.inputStr("Digite a Senha Mestre\n");
        if ("123".equals(masterPassAttempt)) {
            FachadaCartorioEleitoral cartorio = new FachadaCartorioEleitoral();
            String n = GUI.inputStr("Nome: ");
            String c = GUI.inputStr("CPF: ");
            String t = GUI.inputStr("Título: ");
            cartorio.cadastraEleitor(c, n, t);
            GUI.showMessage("Eleitor registrado com sucesso!");
        } else {
            GUI.showMessage("Senha Incorreta!");
        }
    }
    
    public static void registraPartidos() {
        String masterPassAttempt = GUI.inputStr("Digite a Senha Mestre\n");
        if ("123".equals(masterPassAttempt)) {
            FachadaCartorioEleitoral cartorio = new FachadaCartorioEleitoral();
            String n = GUI.inputStr("Nome: ");
            String s = GUI.inputStr("Sigla ");
            cartorio.cadastraPartido(n, s);
            GUI.showMessage("Partido registrado com sucesso!");
        } else {
            GUI.showMessage("Senha Incorreta!");
        }
    }
    
    public static void verificarCandidatos() {
    }
    
    public static void Votar() {
        int flag = GUI.inputInt("Escolha uma opção:\n"
                + "1 - Prefeito\n" + "2 - Vereador");
        if (flag == 1) {
            // INSERIR OPÇAO DE PREFEITOS
        } else if (flag == 2) {
            // INSERIR OPÇAO DE VEREADORES
        }
    }
    
    public static void registraCandidato() {
        String masterPassAttempt = GUI.inputStr("Digite a Senha Mestre\n");
        if ("123".equals(masterPassAttempt)) {
            FachadaCartorioEleitoral cartorio = new FachadaCartorioEleitoral();
           // String n = GUI.inputStr("Nome: ");
            // String c = GUI.inputStr("CPF: ");
            //  String t = GUI.inputStr("Título: ");
            //  cartorio.cadastraEleitor(c, n, t);
            GUI.showMessage("Candidato registrado com sucesso!");
        } else {
            System.out.println("Senha Incorreta!");
        }
    }
    
    public static void registraZonaEleitoral() {
        String masterPassAttempt = GUI.inputStr("Digite a Senha Mestre\n");
        if ("123".equals(masterPassAttempt)) {
            FachadaCartorioEleitoral cartorio = new FachadaCartorioEleitoral();
            String n = GUI.inputStr("Numero: ");
            String l = GUI.inputStr("Localização: ");
            cartorio.cadastraPartido(n, l);
            GUI.showMessage("Zona Eleitoral registrada com sucesso!");
        } else {
            System.out.println("Senha Incorreta!");
        }
    }
    
    public static void registraSecao() {
        String masterPassAttempt = GUI.inputStr("Digite a Senha Mestre\n");
        if ("123".equals(masterPassAttempt)) {
            FachadaCartorioEleitoral cartorio = new FachadaCartorioEleitoral();
            int n = GUI.inputInt("Numero: ");
            int z = GUI.inputInt("Numero da Zona Eleitoral: ");
            String l = GUI.inputStr("Localização da Zona Eleitoral: ");
            for (int i = 0; i < cartorio.numeroDeZonasEleitorais(); i++) {
                if (cartorio.verifica(z)) {
                    cartorio.cadastraSecao(n);
                    GUI.showMessage("Seção registrada com sucesso!");
                } else {
                    GUI.showMessage("Zona Eleitoral inexistente! Tente novamente.");
                }
            }            
        } else {
            GUI.showMessage("Senha Incorreta!");
        } 
    } 
    
    public static void verificaCadastros() {
        
        //GUI.showMessage(msg);
    }
    
}
