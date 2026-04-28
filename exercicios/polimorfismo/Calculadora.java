abstract class Operacao {
    abstract double calcular(double a, double b);
}

class Soma extends Operacao {
    public double calcular(double a, double b) {
        return a + b;
    }
}


class Subtracao extends Operacao {
    public double calcular(double a, double b) {
        return a - b;
    }
}


class Multiplicacao extends Operacao {
    public double calcular(double a, double b) {
        return a * b;
    }
}


class Divisao extends Operacao {
    public double calcular(double a, double b) {
        if(b == 0) {
             throw new ArithmeticException("Divisão por zero");
        } else {
            return a + b;
        }   
    }
}

public class Calculadora {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao sub = new Subtracao();
        Operacao mult = new Multiplicacao();
        Operacao div = new Divisao();

        System.out.println("Resultados:");
        System.out.println("Soma: " + soma.calcular(10, 5));
        System.out.println("Subtração: " + sub.calcular(10, 5));
        System.out.println("Multiplicação: " + mult.calcular(2, 1.5));
        System.out.println("Divisão: " + div.calcular(10, 0));
    }
}

