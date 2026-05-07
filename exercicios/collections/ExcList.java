import java.util.List;
import java.util.ArrayList;

public class ExcList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Harry Potter");
        lista.add("Coraline");
        lista.add("Ponio");
        lista.add("Castelo Animado");

        // lista de filmes:
        System.out.println("Lista de filmes: "+ lista);

        // verificando se existe na lista o filme "coraline" (volta true)
        System.out.println("O filme 'Coraline' está na lista? "+ lista.contains("Coraline"));

        
    }
}