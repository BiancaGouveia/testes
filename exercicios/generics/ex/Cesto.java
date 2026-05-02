class Peixe {
    private String nome;
    private double tamanho;

    public Peixe(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNPeixe() {
        return nome;
    }
    public double getTPeixe() {
        return tamanho;
    }
}

class Polvo {
    private String nome;
    private int tentaculo;

    public Polvo(String nome, int tentaculo) {
        this.nome = nome;
        this.tentaculo = tentaculo;
    }

    public String getNPolvo() {
        return nome;
    }
    public int getTPolvo() {
        return tentaculo;
    }
}

public class Cesto <T>{
    private T conteudo; // atributo 'conteudo'

    // metodo que guarda
    public void guardar(T conteudo) {
        this.conteudo = conteudo;
    }

    // metodo que pega
    public T pegar() {
        return conteudo;
    }

    public static void main(String[] args) {
       Peixe infoPe = new Peixe("Tilapia", 18.2);// criando instancia
       Polvo infoPo = new Polvo("polvo-dumbo", 8); // criando instancia

       // informacoes do peixe
        String NmPeixe = infoPe.getNPeixe();
        double TmPeixe = infoPe.getTPeixe();

        // informacoes do polvo
        String NmPolvo = infoPo.getNPolvo();
        int TmPolvo = infoPo.getTPolvo();

        System.out.println("peixe-> \n  o nome dele: " +
            NmPeixe + "\n o tamanho dele: " + TmPeixe
        );

        System.out.println("polvo-> \n  o nome dele: " +
            NmPolvo + "\n quantidade de tentaculos dele: " + TmPolvo
        );
    }
}