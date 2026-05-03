public class SimplesCaixa<T> { // classe genérica
    private T valor; // atributo

    public void guardar(T valor) {
        this.valor = valor;
    }

    public T mostrar() {
        return valor;
    }

    public static void main(String[] args) {
        // criando caixa que guarda Strings
        SimplesCaixa<String> caixaString = new SimplesCaixa<>();
       
        // criando caixa que guarda inteiros
        SimplesCaixa<Integer> caixaInt = new SimplesCaixa<>();

        // colocando os valores no metodo de guardar o valor
        caixaString.guardar("Bianca Gouveia");
        caixaInt.guardar(1910);

        // retornando o valor
        String palavras = caixaString.mostrar();
        int valores = caixaInt.mostrar();

        System.out.println(palavras);
        System.out.println(valores);
    }
}