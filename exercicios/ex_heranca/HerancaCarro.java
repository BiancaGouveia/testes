class Veiculo {
    public void acelerar() {
        System.out.println("veiculo acelerando!");
    }
}

class Carro extends Veiculo{
    public void acelerar() {
        super.acelerar();
        System.out.println("carro acelerando!");
    }
}

public class HerancaCarro {
    public static void main(String[] args) {
        Carro c = new Carro();

        c.acelerar();
    }
}