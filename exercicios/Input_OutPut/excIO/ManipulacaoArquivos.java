import java.io.*;

public class ManipulacaoArquivos {
    public static void main(String[] args) {
        
        try {
            FileWriter escrever = new FileWriter("arquivo.txt");
            escrever.write("Lorem ipsum dolor sit, amet consectetur adipisicing elit. Explicabo vero laborum ex fugit ducimus nihil modi, mollitia quas adipisci repellat nulla suscipit doloremque deleniti reprehenderit voluptatibus cum voluptatem reiciendis doloribus?");
            escrever.close();

            FileReader ler = new FileReader("arquivo.txt");
            int data = ler.read();

            while(data != -1) {
                System.out.print((char)data); // casting

                data = ler.read();
            }
            ler.close();
        } catch(IOException erro) {
            System.out.println(erro.getMessage());
        }
    }
}