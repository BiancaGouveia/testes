package exercicios.empresa.dados;

public class Funcionario {
    private String nome;
    public double salario;

    // esse aqui é o construtor
    public Funcionario(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }

    public String obterInfo() {
        return "Nome " + nome + ", Salario: " + salario;
    }

    // metodo usando passagem por valor
    public void aumentarSalario(double aumento) {
        salario += aumento;
        //aumento += 1000;
    }
    // metodo usando passagem por REFERENCIA
    public void alterarQualquerSalario(Funcionario func, double novoSalario) {
        func.salario = novoSalario;  
    }
}