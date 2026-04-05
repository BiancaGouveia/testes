package exercicios.banco.cofre;
import exercicios.banco.cofre.CofreCliente;

public class CofrePremium extends CofreCliente {
    public CofrePremium (String nome, double dinheiro) {
        super(nome, dinheiro);
    }
    public void mostrarBonus() {
        // acessando atributos protected
        System.out.println("Cliente Premium: " +nome);
        System.out.println("Com bonus: " + (dinheiro + 1000));
    }
}