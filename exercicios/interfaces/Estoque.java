interface Produto {
    String getNome();
    int getQuantidade();

    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto {
    private String nome;
    private int quantidade;

    // Construtor
    public ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    @Override
    public void removerQuantidade(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque ou valor inválido.");
        }
    }
}

public class Estoque {
    public static void main(String[] args) {
        Produto produto = new ProdutoImpl("Caneta", 50);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());

        produto.adicionarQuantidade(20);
        System.out.println("Após adicionar 20: " + produto.getQuantidade());

        produto.removerQuantidade(15);
        System.out.println("Após remover 15: " + produto.getQuantidade());

        produto.removerQuantidade(100); // teste de erro
    }
}