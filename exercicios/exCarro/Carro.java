package exercicios.exCarro;

class Carro {
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    // Construtor padrão
    public Carro() {
        marcaDoCarro = "Desconhecida";
        modeloDoCarro = "Desconhecido";
        anoDoCarro = 0;
    }

    // Construtor com marca e modelo
    public Carro(String marcaDoCarro, String modeloDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = 0;
    }

    // Construtor completo
    public Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Detalhes do carro:");
        System.out.println("Marca: " + marcaDoCarro);
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano: " + anoDoCarro);
        System.out.println(); // linha em branco
    }
}