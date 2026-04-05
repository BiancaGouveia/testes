package exercicios.biblioteca;

class Livro {

    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco;

    // construtor padrão
    public Livro() {
        titulo = "Desconhecido";
        autor = "Desconhecido";
        anoPublicacao = 0;
        preco = 0.0;
    }
    // construtor com dois parâmetros
    public Livro(String tituloInit, String autorInit) {
        titulo = tituloInit;
        autor = autorInit;
        anoPublicacao = 0;
        preco = 0.0;
    }
    // construtor com quatro parâmetros
    public Livro(String tituloInit, String autorInit, int anoPublicacaoInit, double precoInit) {
        titulo = tituloInit;
        autor = autorInit;
        anoPublicacao = anoPublicacaoInit;
        preco = precoInit;
    }

    public String getAutor() {
        return autor;
    }
}