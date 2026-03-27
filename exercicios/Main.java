package exercicios;
import exercicios.Produto;

public class Main extends Produto {
    public static void main(String[] args) {
        Produto prod = new Produto();
            prod.setNome("pringles");
            prod.setPreco(12.50);
            prod.setQuantidadeEmEstoque(105);

            System.out.println("Produto: " + prod.getNome());
            System.out.println("valor do produto: R$" + prod.getPreco());
            System.out.println("quantidade em estoque: " + prod.getQuantidadeEmEstoque());
    }
}