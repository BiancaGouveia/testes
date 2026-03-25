package banco.cofre;

public class CofreCliente {
    protected String nome;
    protected double dinheiro;

    public CofreCliente(String nomeInit, double dinheiroInit) {
        nome = nomeInit;
        dinheiro = dinheiroInit;

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Dinheiro disponível do cliente: " + dinheiro);
    }
}