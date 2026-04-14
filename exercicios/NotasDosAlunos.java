public class NotasDosAlunos {
    public static void main(String[] args) {

        double[] aNotasAlunos; // declaração de array
        aNotasAlunos = new double[5]; // criação de array

        aNotasAlunos[0] = 6.5;
        aNotasAlunos[1] = 5.0;
        aNotasAlunos[2] = 7.2;
        aNotasAlunos[3] = 9.0;
        aNotasAlunos[4] = 5.5;

        System.out.println("Notas dos alunos:");
        for(int i=0; i< aNotasAlunos.length; i++) {
            System.out.println(aNotasAlunos[i]);
        }

    }
}