public class ExemploNullPointerExceptionInteger {
    
    static Integer numero = null;

    public static void main(String[] args) {

        try {
            System.out.println("resultado: " + numero.toString());
        } catch (NullPointerException e) {
            System.out.println("a variavel está nula! ");
        } finally {
            System.out.println("O codigo está funcionando...");
        }
    }
}