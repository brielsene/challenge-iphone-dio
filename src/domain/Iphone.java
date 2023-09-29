package domain;

public class Iphone implements AparelhoTelefonico, NavegacaoInternet, ReprodutorMusical{
    @Override
    public void ligar() {
        System.out.println("Ligado...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz...");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página...");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Autalizando Página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }
}
