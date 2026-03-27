package exercicios;
import exercicios.*;

public class ProdutoPremium extends Produto {
    public ProdutoPremium(String nm, double prc, int qtd) {
        super(nome, preco, quantidadeEmEstoque);
    }

    public void mostrarProdsPremium() {
        System.out.println("==============");
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidadeEmEstoque);
    }
}