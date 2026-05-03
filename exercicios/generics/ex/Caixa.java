public class Caixa<T> { // Classe genérica, T representa qualquer tipo

    private T[] elementos; // Array que vai armazenar os elementos do tipo T

    // Construtor que define o tamanho da caixa
    public Caixa(int capacidade) { 
        // Cria um array de Object e faz cast para T[]
        elementos = (T[]) new Object[capacidade]; 
    }

    // Método para adicionar um elemento em uma posição específica
    public void adicionar(T elemento, int indice) { 
        elementos[indice] = elemento; // Armazena o elemento no índice informado
    }

    // Método para obter um elemento de uma posição específica
    public T obter(int indice) { 
        return elementos[indice]; // Retorna o elemento do índice
    }

    public static void main(String[] args) { 

        // Criando uma caixa para armazenar valores Double
        Caixa<Double> caixaDePrecos = new Caixa<>(3); 

        // Adicionando valores nas posições 0 e 1
        caixaDePrecos.adicionar(10.5, 0); 
        caixaDePrecos.adicionar(20.0, 1); 

        // Exibindo os valores armazenados
        System.out.println("Preço 1: " + caixaDePrecos.obter(0)); // Saída: 10.5 
        System.out.println("Preço 2: " + caixaDePrecos.obter(1)); // Saída: 20.0 

        // Criando uma caixa para armazenar caracteres
        Caixa<Character> caixaDeLetras = new Caixa<>(2); 

        // Adicionando letras nas posições
        caixaDeLetras.adicionar('A', 0); 
        caixaDeLetras.adicionar('B', 1); 

        // Exibindo as letras armazenadas
        System.out.println("Letra 1: " + caixaDeLetras.obter(0)); // Saída: A 
        System.out.println("Letra 2: " + caixaDeLetras.obter(1)); // Saída: B 
    }
}