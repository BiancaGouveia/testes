package empresa.dados;

public class Funcionario {
    private String nome;
    private double salario;


    // para que outras classes possam utilizar deste construtor usei o modificador de acesso public
    public Funcionario(String nomeInit, double salarioInit) {  
        nome = nomeInit;
        salario = salarioInit;
    }
    public String obterInfo() {
        return "Nome: "+ nome +", salario: " + salario;
    }
}