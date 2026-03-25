package empresa.dados;
import empresa.dados.FolhaDePagamento;

public class FolhaDePagamento {
    public static void main (String[] args) {
        Funcionario f = new Funcionario("Bianca", 5000.00);
        System.out.println(f.obterInfo());
    }
}