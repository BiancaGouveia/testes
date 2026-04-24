abstract class Loja {
    String cnpj;
    String razaoSocial;
    String aberta;

    Loja(String cnpj, String razaoSocial, String aberta) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = aberta;
    }

    abstract String abrir();
    abstract String fechar();
}

class LojaComercial extends Loja {

    LojaComercial(String cnpj, String razaoSocial, String aberta) {
        super(cnpj, razaoSocial, aberta);
    }

    @Override // sobreescreve o método abrir() da classe abstrata
    String abrir() {
        return "aberto";
    }

    @Override // sobreescreve o método fechar() da classe abstrata
    String fechar() {
        return "fechado";
    }
}

public class LojaAbstrata {
    public static void main(String[] args) {

        LojaComercial info = new LojaComercial(
            "34.596.674/0000-45",
            "LTDA",
            "PetShop"
        );

        System.out.println("Informações da loja:");
        System.out.println("CNPJ: " + info.cnpj);
        System.out.println("Razão Social: " + info.razaoSocial);
        System.out.println("Tipo: " + info.aberta);

        System.out.println("Situação: " + info.abrir());
        System.out.println("Situação: " + info.fechar());
    }
} 