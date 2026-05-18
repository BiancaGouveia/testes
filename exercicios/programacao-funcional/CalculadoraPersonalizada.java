@FunctionalInterface
interface OperacaoMatematica {

    double executar(double a, double b); // metodo abstrato

}

public class CalculadoraPersonalizada {
    public static void main(String[] args) {

       OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
       OperacaoMatematica raizQuadrada = (a, b) -> Math.sqrt(a);

        System.out.printf("Potênciação: %.4f\n" , potencia.executar(2, 10));
        System.out.printf("Raiz quadrada: %.4f\n" , raizQuadrada.executar(15, 0));
    }
}