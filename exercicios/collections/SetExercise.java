import java.util.Set;
import java.util.HashSet;

public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> conjNms = new HashSet<>();
        
        conjNms.add(1); 
        conjNms.add(2);
        conjNms.add(3);
        conjNms.add(4);
        conjNms.add(5);
        conjNms.add(6);


        System.out.println("primeira formação do conjunto: " + conjNms);

        System.out.println("O numero 4 está no conjunto? " +conjNms.contains(4)); // retorna true

        conjNms.remove(6);
        System.out.println("conjunto depois da remoção: " + conjNms); // aparece tudo menos o 6
        

        // tentando adicionar o numero 6 novamente (lembrando que collections não fazem duplicatas)
        boolean conjAdicionado = conjNms.add(6);
        System.out.println("o valor 6 foi adicionado?: " + conjAdicionado); // dá true, mas se fosse um conj de tipo String, seria false

        conjNms.clear(); // limpa todo o conjunto
        System.out.println("conjunto depois de limpo: " + conjNms);
    }
}