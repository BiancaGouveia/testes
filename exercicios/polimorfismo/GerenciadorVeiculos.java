abstract class Veiculo {
    private  String placa;
    private  int ano;

    public abstract String exibirInformacoes();

    // pegando os atrib privados
    public String getPlaca() {
        return placa;
    }
    public int getAno() {
        return ano;
    }


    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }
}

class Onibus extends Veiculo {
    
     int assentos;
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

   
    @Override
    public String exibirInformacoes() {
         return "Onibus - Placa: " + getPlaca() +
           ", Ano: " + getAno() +
           ", Assentos: " + assentos;
    }
}

class Caminhao extends Veiculo {
    int eixos;
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
     public String exibirInformacoes() {
         return "Caminhao - Placa: " + getPlaca() +
           ", Ano: " + getAno() +
           ", Eixos: " + eixos;
    }  
}

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Onibus infOnibus = new Onibus("SP110B96", 2012, 12);
        Caminhao infCaminhao = new Caminhao("BTS4R09", 2013, 10);

        System.out.println(infOnibus.exibirInformacoes());
        System.out.println(infCaminhao.exibirInformacoes());
    }
}
