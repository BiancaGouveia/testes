class ExemploDepreciado {
    @Deprecated
    public void metodoObsoleto() {
        System.out.println("info do metodo obsoleto");
    }
}

public class ExecSupprWarn {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ExemploDepreciado ex = new ExemploDepreciado();
        ex.metodoObsoleto();
    }
}