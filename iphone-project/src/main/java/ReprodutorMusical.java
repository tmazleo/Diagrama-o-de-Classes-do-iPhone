import java.util.Scanner;

public interface ReprodutorMusical {
    public String[] musicas = {"musica1", "musica2", "musica3", "musica4"};



    static void selecionarMusica(int indice) {
        if (indice >= 0 && indice < musicas.length) {
            System.out.println("Música selecionada: " + musicas[indice]);
        }
    }
    static void tocar(boolean play) {
        if (play) {
            System.out.println("tocando musica!");
        }else{
            System.out.println("pausado!");

        }
    }

}
