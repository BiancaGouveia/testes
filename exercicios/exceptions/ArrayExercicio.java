public class ArrayExercicio {
    // implementando metodo
    int[] meuArray = {10, 20, 30 ,40, 50};

    int acessarElemento(int[] array, int indice) {

        try {
            return array[indice];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro! Indice fora dos limites do array " + e.getMessage());
            return -1; // valor padrão para indicar erro
        } finally {

            System.out.println("codigo funcionando com ou sem problemas...");
        }
    }
    public static void main(String[] args) {
        
        ArrayExercicio info = new ArrayExercicio();

        // testando indices validos
        System.out.println("elemento no indice 2: " + info.acessarElemento(info.meuArray, 2));

        // teste com indices inválidos
        System.out.println("elemento no indice 10: " + info.acessarElemento(info.meuArray, 10));
    }
}