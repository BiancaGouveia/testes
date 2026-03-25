package banco.cofre;
import banco.cofre.CofreCliente;

public class InicializandoDados {
    public static void main(String[] args) {
        CofrePremium cliente = new CofrePremium("Maria", 5000);
        cliente.mostrarBonus(); // método usado no CofrePremium
    }
}