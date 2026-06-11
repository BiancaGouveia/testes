import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class ManipulacaoArquivos {
    public static void main(String[] args) {
        Path path = Paths.get("meuArquivo.txt");

        try {
            // escrevendo um arquivo
            Files.write(path, "VAAAAAI CORINTHIANS!! MELHOR TIME DO MUNDO!".getBytes());

            // lendo um arquivo
            byte[] bytes = Files.readAllBytes(path);

            String content = new String(bytes);
            System.out.println(content);

        } catch(IOException erro) {
            System.out.println(erro.getMessage());
        }
    }
}