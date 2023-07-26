package teste;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
		
        System.out.println("-------Reprodutor Musical:-------");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
		
        System.out.println("-------Aparelho telefonico:-------");
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioDeVoz();
		
        System.out.println("-------Navegador na Internet:-------");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
