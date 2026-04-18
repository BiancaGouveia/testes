class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String nomeInit) {
        nome = nomeInit;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salarioInit) {
        salario = salarioInit;
    }

    public double getSalario() {
        return salario;
    }

    public void addAumento(double valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 12;
    }
}

class Assistente extends Funcionario {
    
    public double ganhoAnual() {
        return super.ganhoAnual() + 1000;
    }
}

public class FuncAss {
    public static void main(String[] args) {
        Assistente info = new Assistente();

        info.setNome("João");
        info.setSalario(3000);
        info.addAumento(500);

        System.out.println("Informações do funcionário:");
        System.out.println("Nome: " + info.getNome());
        System.out.println("Salário anual: " + info.ganhoAnual());
    }
}