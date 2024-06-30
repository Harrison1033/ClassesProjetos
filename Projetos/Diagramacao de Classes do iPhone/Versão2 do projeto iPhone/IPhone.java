package classes;


//iPhone2
public class IPone implements ReprodutorMusical, Telefone, Internete {
	
    //Reprodutor de Músicas
    @Override
    public void tocar() {
        System.out.println("Toca um música:");
    }

    @Override
    public void pausar() {
        System.out.println("Pausa uma música:");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Seleciona uma música: ");
    }

    //Telefone
    @Override
    public void ligar() {
        System.out.println("Faz uma chamada:");
    }

    @Override
    public void atender() {
        System.out.println("Atende uma chamada:");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Inicia um correio de voz:");
    }

    //Internete
    @Override
    public void exibir() {
        System.out.println("Exibe a Página de Internet: ");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adiciona nova aba no navegador: ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiza uma nova página: ");
    }
	
}
