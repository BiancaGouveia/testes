class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}

class Estudante extends Pessoa{
    private String matricula;

    public Estudante(String nome, int idade, String matricula) { 
        super(nome, idade); // chama o construtor da classe pai
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}

public class PessEstu {
    public static void main(String[] args) {
        Estudante info = new Estudante(
            "Maria Gisele da Costa", 
            15,
            "lk39100_2011"
        );

        System.out.println("Informações");
        System.out.println("Nome " + info.getNome());
        System.out.println("Idade " + info.getIdade());
        System.out.println("Matricula " + info.getMatricula());
    }
}