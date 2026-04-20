final class Veiculo {
    ligarMotor() {
        System.out.println("motor ligado");
    }
}

public class Carro extends Veiculo{ // ñ se estende class final
    public static void main(String[] args) {
        Veiculo func = new Veiculo();

        System.err.println("está funcionando?");
    }
} 