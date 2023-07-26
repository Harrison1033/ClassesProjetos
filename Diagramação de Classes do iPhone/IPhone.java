package teste;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void tocar() {
        System.out.println("Toca a música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausa a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Seleciona a música");
    }

    @Override
    public void ligar() {
        System.out.println("Liga para o número desejado");
    }

    @Override
    public void atender() {
        System.out.println("Atende a ligação ");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Inicia o correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibe a página no navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adiciona uma nova aba ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiza a página do navegador");
    }
}
