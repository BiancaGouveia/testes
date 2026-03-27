package exercicios;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public void setNome(String nomeInit) { // definindo o nome
        nome = nomeInit;
    }

    public void setPreco(double precoInit) { // definindo o preco
        preco = precoInit;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoqueInit) { // definindo a qtd em estoque
        quantidadeEmEstoque = quantidadeEmEstoqueInit;
    }

    public String getNome() { // pegando o nome
        return nome;
    }

    public double getPreco() { // pegando o preco
        return preco;
    }

    public int getQuantidadeEmEstoque() { // pegando a quantidade em estoque
        return quantidadeEmEstoque;
    }
}