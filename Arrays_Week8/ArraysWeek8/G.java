import java.util.Scanner;
public class G{
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        int N= ler.nextInt();
        int[] sequencia;
        sequencia=LerTermosSequencia(N);
        MostrarSequenciaInvertida(sequencia,N);
    }
    public static int[] LerTermosSequencia (int N){
        int[] sequencia=new int[N];
        for (int i = 0; i <N ; i++) {
            sequencia[i]= ler.nextInt();
        }
        return sequencia;
    }
    public static void MostrarSequenciaInvertida (int[] sequencia, int N){
        for (int i = N-1; i >=0 ; i--) {
            System.out.println(sequencia[i]);
        }
    }
}