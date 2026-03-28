package exercicios.exProduto;

class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public void setNome(String nomeInit) { // definindo nome
        nome = nomeInit;
    }

    public void setPreco(double precoInit) { // definindo preco
        preco = precoInit;
    }

    public void setQtdEstoque(int qtdEstoqueInit) { // definindo estoque
        qtdEstoque = qtdEstoqueInit;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }
}