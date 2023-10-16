public class Iphone {
    public static void main(String[] args) {


        ReprodutorMusical.selecionarMusica(2);
        ReprodutorMusical.tocar(true);
        ReprodutorMusical.tocar(false);
        System.out.println("----------------------------------------------------------------------");
        AparelhoTelefonico.atender();
        AparelhoTelefonico.ligar();
        AparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("----------------------------------------------------------------------");
        Navegador.exibirPagina(1);
        Navegador.adicionarNovaAba(true);
        Navegador.adicionarNovaAba(false);
        Navegador.atualizarPagina(0);
    }
}
