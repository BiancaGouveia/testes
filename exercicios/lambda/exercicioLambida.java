import java.util.Arrays;
import java.util.*;

public class exercicioLambida {
    public static void main(String[] args) {
        List<Integer> listaNumerica = Arrays.asList(1,2,3,4,5,6,8,10);
        List<Integer> listaPares = new ArrayList<>();

        listaNumerica.forEach( (Integer numero) -> {
                if(numero % 2 == 0) {
                    listaPares.add(numero);
                }
            }
        ); // primeiro parentese da expressão lambda

        System.out.println("numeros pares: " + listaPares);
    }
}