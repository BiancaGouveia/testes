package exercicios;

class Produto {
    protected String nome;
    protected double preco;
    protected int quantidadeEmEstoque;

    public void InicializandoAtb(String nomeInit, double precoInit, int quantidadeEmEstoqueInit) {
        nome = nomeInit;
        preco = precoInit;
        quantidadeEmEstoque = quantidadeEmEstoqueInit;

        System.out.println("produtos: ");
        System.out.println("nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("qtd em estoque: " + quantidadeEmEstoque);
        
    }
}