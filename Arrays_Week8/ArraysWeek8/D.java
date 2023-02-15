import java.util.Arrays;
import java.util.Scanner;
public class D {
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        int numAlunos= ler.nextInt();
        int[] notas=LerEarmazenarNotas(numAlunos);
        MostrarFrequencias(notas);
    }
    public static int [] LerEarmazenarNotas (int numAlunos){
        int[] notas=new int[numAlunos];
        for (int i = 0; i <notas.length ; i++) {
            notas[i]=ler.nextInt();
        }
        return notas;
    }
    public static int DeterminarFrequenciaNotas (int[] notas, int nota){
        int contador=0;
            for (int j = 0; j <notas.length ; j++) {
                if(notas[j]==nota){
                    contador++;
                }
        }
        return contador;
    }
    public static void MostrarFrequencias (int[] notas){

        for (int i = 0; i <=20 ; i++) {
            System.out.println(i+" "+DeterminarFrequenciaNotas(notas,i));
        }
    }
}
