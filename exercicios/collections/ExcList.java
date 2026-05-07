import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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

        List<String> lista2 = Arrays.asList(
            "Alice no País das Maravilhas",
            "Peter Pan"
        );
        
        // adicionando conteúdos da lista2 na lista
        lista.addAll(lista2);

        // como a lista fica depois de adicionar 
        System.out.println("lista com lista2: " + lista);

        // removendo HarryPotter da lista
        lista.remove("Harry Potter");
        System.out.println("O filme 'Harry Potter' ainda está na lista?: " + lista.contains("Harry Potter"));

        System.out.println("lista atualizada: " + lista);

        // lista depois de limpa
        lista.clear();
        System.out.println("lista limpa: " + lista);
    }
}