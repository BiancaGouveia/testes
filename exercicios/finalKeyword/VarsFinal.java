class FinalVariables {
    final int numeroMaximo = 100;
    final String mensagem = "Welcome to the world of programming!";
}

public class VarsFinal { // lembrando que ñ faz extend em final
   public static void main(String[] args) {
     FinalVariables info = new FinalVariables();
    
     // info.numeroMaximo = 120; --> não pega dessa forma
     System.out.println(info.numeroMaximo);
     System.out.println(info.mensagem);
   }
}