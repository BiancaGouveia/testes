public class ListaGenerica<T> {
    // a ideia aqui é criar uma caixa com vários espaços (array)

    private T[] elementos;

    // construtor
    public ListaGenerica(int tamanho) {
        elementos = (T[]) new Object[tamanho];
    }

    // adicionar elemento
    public void adicionar(T elemento, int indice) {
        elementos[indice] = elemento;
    }

    // obter elemento
    public T obter(int indice) {
        return elementos[indice];
    }

    public static void main(String[] args){
        ListaGenerica<String> lista = new ListaGenerica<>(3);

        lista.adicionar("Ana", 0);
        lista.adicionar("Bia", 1);
        lista.adicionar("Corinthians", 2);

        System.out.println(lista.obter(0));
        System.out.println(lista.obter(1));
        System.out.println(lista.obter(2));
    }
}