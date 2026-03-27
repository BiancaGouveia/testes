package exercicios;
import exercicios.Produto;

public class Main extends Produto {
    public Main(String nm, double preco, int qtd) {
        super(nome, preco, quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Main produtosMain = new Main("pringles", 12.50, 105);

    }
}