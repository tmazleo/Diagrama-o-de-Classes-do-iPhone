public interface Navegador {
    public String[] paginas = {"pagina1","pagina2"};

    static void exibirPagina(int pagina) {
        if (pagina >= 0 && pagina< paginas.length) {
            System.out.println("pagina selecionada: "+paginas[pagina]);
        }
    }
    static void adicionarNovaAba(boolean addAba){
        if (addAba){
            System.out.println("nova aba aberta!");
        }else{
            System.out.println("apenas uma aba exibida!");
        }
    }
    static void atualizarPagina(int pagainaS) {
        if (pagainaS >= 0 && pagainaS < paginas.length) {
            System.out.println(paginas[pagainaS]+" atualizada");
        }
    }
}
