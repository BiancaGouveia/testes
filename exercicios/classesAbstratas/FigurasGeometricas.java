abstract class FiguraGeometrica {
    abstract double calcularArea();
    abstract double calcularPerimetro();
}
class Retangulo extends FiguraGeometrica {
    double base =12;
    double altura=10;
    
    @Override 
    double calcularArea() {
        return base*altura;
    }

    @Override
    double calcularPerimetro() {
        return 2*(base*altura);
    }
}

public class FigurasGeometricas {
    public static void main(String[] args) {
        Retangulo info = new Retangulo();

        System.out.println("Informações do retângulo:");
        System.out.println("Área do retângulo: " + info.calcularArea());
        System.out.println("Perímetro do retângulo: " + info.calcularPerimetro());
    }
}