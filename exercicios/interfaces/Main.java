interface Veiculo {
    public void iniciar();
    public void parar();

    default void buzinar() {
        System.out.println("Buzinar");
    }
}

class Carro implements Veiculo {
    public void iniciar(){}
    public void parar(){}
}

class Caminhao implements Veiculo {
    public void iniciar() {}
    public void parar() {}
}

public class Main {
    public static void main(String[] args) {
        Carro carro =  new Carro();
        carro.iniciar();
        carro.buzinar();

        Caminhao caminhao = new Caminhao();
        caminhao.iniciar();
        caminhao.buzinar();
    }
}