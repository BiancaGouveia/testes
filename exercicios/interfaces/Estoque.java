interface Produto {
    String getNome();
    int getQuantidade();

    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto {
    private String nome;
    private int quantidade;
    
    // crio a partir daqui um construtor
    public ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override // indico aqui que sobrescrevi a instância 'getNome' da interface
    public String getNome() {
        return nome;  // aqui eu fiz o encapsulamento
    } // retornando a instância criada nessa classe
    

    @Override // indico aqui que sobrescrevi a instância 'getQuantidade' da interface
    public int getQuantidade() {
        return quantidade; // aqui eu fiz o encapsulamento
    } // retornando a instância criada nessa classe

    @Override // indico aqui que sobrescrevi o método 'adicionarQuantidade' da interface
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade; // CORRIGIDO (+=)
    }

    @Override // indico aqui que sobrescrevi o método 'removerQuantidade' da interface
    public void removerQuantidade(int quantidade) {
        if(this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.err.println("Quantidade insuficiente em estoque!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // não tem como instanciar uma interface diretamente
        Produto infProduto = new ProdutoImpl("Caneta", 50);

        System.out.println("Produto: " + infProduto.getNome());
        System.out.println("Quantidade em estoque: " + infProduto.getQuantidade());

        infProduto.adicionarQuantidade(20);
        System.out.println("nova quantidade após adição: " + infProduto.getQuantidade());

        infProduto.removerQuantidade(15);
        System.out.println("nova quantidade após remoção: " + infProduto.getQuantidade());
    
        infProduto.removerQuantidade(100);
    }
}