public class Par<T> { // classe genérica
    
    private T primeiro; // valores do mesmo
    private T segundo; // tipo

    public void guardarPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public void guardarSegundo(T segundo) {
        this.segundo = segundo;
    }

    public T getPrimeiro() {
        return primeiro;
    }
    public T getSegundo() {
        return segundo;
    }

    public static void main(String[] args) {
        Par<Integer> caixaNms = new Par<>();
        Par<String> caixaPalavras = new Par<>();

        caixaNms.guardarPrimeiro(1910);
        caixaPalavras.guardarSegundo("Bianca");

        Integer valor = caixaNms.getPrimeiro();
        String palavra = caixaPalavras.getSegundo();

        System.out.println("valor informado: " + valor);
        System.out.println("palavra informada: " + palavra);
    }
}