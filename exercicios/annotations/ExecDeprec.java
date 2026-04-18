class MinhaClasse {
    public int calcularSoma(int a, int b) {
        return a+b;
    }

    @Deprecated
    public int calcularProduto(int a, int b) {
        return a*b;
    }
}

public class ExecDeprec {
    public static void main(String[] args) {
        MinhaClasse result = new MinhaClasse();

        result.calcularSoma(1, 2);
        result.calcularProduto(10, 2);
    }
}