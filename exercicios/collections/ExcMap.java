import java.util.Map;
import java.util.HashMap;

public class ExcMap {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("P001", 10);
        estoque.put("P002", 11);
        estoque.put("P003", 12);
        estoque.put("P004", 13);

        // lembrando que não é ordenado
        System.out.println("Estoque inicial: "+ estoque);

        // verificando quantidade disponível de um produto específico
        System.out.println("quantidade disponpivel do produto 'P003': " + estoque.get("P003"));

        // removendo uma quantidade especifica de produto do estoque
        int quantidadeRemover = 5;
        int quantidadeAtual = estoque.get("P002");
        estoque.put("P002", quantidadeAtual - quantidadeRemover);

        System.out.println("quantidade atual do estoque P002: " + estoque.get("P002"));

        // atualizando o estoque (lembrando que não é ordenado)
        System.out.println("estoque após remoção: " + estoque);
    }
}