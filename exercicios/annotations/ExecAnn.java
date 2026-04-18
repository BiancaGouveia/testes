class SuperClasse {
    // esse método será sobreescrito na classe filha
    public void imprime() {
        System.out.println("imprime");
    }
}

class MinhaClasse extends SuperClasse{

    @Override
    public void imprime() {
        System.out.println("imprime diferente");
    }
}

public class ExecAnn {
    public static void main(String[] args) {
        MinhaClasse exec = new MinhaClasse();

        exec.imprime();
    }
}