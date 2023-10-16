public interface AparelhoTelefonico {
    public String numero = "1195856847";

    static void ligar(){
        System.out.println("ligando para " + numero);
    }
    static void atender() {
        System.out.println("atendendo numero "+numero);
    }
    static void iniciarCorreioVoz(){
        System.out.println("correio de voz!");
    }

}
