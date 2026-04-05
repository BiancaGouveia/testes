package exercicios.biblioteca;
import biblioteca.Livro;

public class Aplicacao {
    public static void main(String[] args) {
        Livro info = new Livro("A Seleção", "Kiera Kass");

        System.out.println("nome do autor do livro:" + info.getAutor());
        System.out.println("titulo do livro: " + info.titulo);
        System.out.println("ano de lancamento: " + info.anoPublicacao);
        System.out.println("valor " + info.preco);
        
    }
}