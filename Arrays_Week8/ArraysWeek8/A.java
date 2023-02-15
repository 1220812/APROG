import java.util.Scanner;
public class A {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        final int NOTA_MINIMA_POSITIVA=10;
        int numAlunos= ler.nextInt(), contadorNegativas=0;
        double somaNotas=0;
        double[] notas=new double[numAlunos];
        for (int aluno = 0; aluno <notas.length ; aluno++) { // Preencher Array
            notas[aluno]= ler.nextInt();
        }
        for (int aluno = 0; aluno < notas.length ; aluno++) {
            somaNotas+=notas[aluno];
            if(notas[aluno]<NOTA_MINIMA_POSITIVA){
                contadorNegativas++;
            }
        }
        System.out.printf("average=%.1f\n", CalcularMedia(somaNotas,numAlunos));
        System.out.println("failures="+contadorNegativas);
    }
    public static double CalcularMedia (double somaNotas, int numAlunos){
        return somaNotas/numAlunos;
    }
}