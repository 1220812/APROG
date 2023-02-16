import java.util.Scanner;
public class K {
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        int N= ler.nextInt();
        int[] conjunto=new int[N];
        conjunto=LerNumerosConjuto(conjunto);
        MostrarArraySemNumerosRepetidos(conjunto);
    }
    public static int[] LerNumerosConjuto(int[] conjunto){
        for (int i = 0; i < conjunto.length ; i++) {
            conjunto[i]= ler.nextInt();
        }
        return conjunto;
    }
    public static void MostrarArraySemNumerosRepetidos (int[] conjunto){
        boolean repetido;
        for (int i = 0; i < conjunto.length ; i++) {
            repetido=false;
            for (int j = 0; j < i ; j++) {
                if(conjunto[i]==conjunto[j]){
                    repetido=true;
                }
            }
            if (!repetido){
                System.out.println(conjunto[i]);
            }
        }
    }
}
