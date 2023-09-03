public class Iphone implements ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void tocarMusica(String musica) {
        System.out.println("** Tocando música: " + musica + "**");
    }

    @Override
    public void pausarMusica() {
        System.out.println("** Música pausada **");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("** Ligando o iPhone **");
    }

    @Override
    public void atenderChamada() {
        System.out.println("** Chamada atendida **");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("** Iniciando correio de voz **");
    }

    @Override
    public void navegarInternet() {
        System.out.println("** Navegando na Internet **");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba adicionada com URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}