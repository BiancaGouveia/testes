import java.util.ArrayList;
import java.util.List;

public class ExercicioManipListas{
    public static void main(String[] args) {
        // Criação da lista
        List<String> minhaLista = new ArrayList<>();

        // adicionando elementos à lista
        minhaLista.add("Corinthians");
        minhaLista.add("SCCP");
        minhaLista.add("Hugo Souza");
        minhaLista.add("Bianca Corinthiana");
        minhaLista.add("Bia SCCP");

        // remove elementos com mais de 10 caracteres
        minhaLista.removeIf(s -> s.length() > 10);

        // adiciona elemento no topo da lista
        minhaLista.add(0, "amooo");

        // imprime tudo
        minhaLista.forEach(System.out::println);
        /*
        é praticamente a mesma coisa que:
        minhaLista.forEach(s -> System.out.println(s)); 
        */
    }
} 
