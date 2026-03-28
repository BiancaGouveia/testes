package exercicios.exProduto;
import exercicios.exProduto.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produtos = new Produto();

        produtos.setNome("pringles");
        produtos.setPreco(11.50);
        produtos.setQtdEstoque(111);

        System.out.println("descrição do produto: ");
        System.out.println("nome: " + produtos.getNome());
        System.out.println("valor unitario: " + produtos.getPreco());
        System.out.println("quantidade disponivel: " + produtos.getQtdEstoque());
    }
}