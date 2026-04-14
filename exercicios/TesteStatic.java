public class TesteStatic {
    
        public static void exibirValor(int val) {
            System.out.println("o valor do inteiro é: " + val);
        }
    
    public static void main(String[] args) {
        exibirValor(8); // funcionou sem chamar a classe pq ambos são STATIC
    }
}






// ===============================

/*
public class TesteStatic {
    // Método estático sobrecarregado #1
    public static void exibirValor(int a) {
        System.out.println("o valor do inteiro é: " + a);
    }

    // Método estático sobrecarregado #2
    public static void exibirValor(String str) {
        System.out.println("a string é: " + str);
    }
}
*/