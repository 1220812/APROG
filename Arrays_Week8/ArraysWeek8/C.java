import java.util.Scanner;
public class C {
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        int N= ler.nextInt();
        System.out.println("always ascending = "+AscendingSequence(N));
    }
    public static int[] LerEguardarNumeros (int N){
        int[] numeros=new int[N];
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]= ler.nextInt();
        }
        return numeros;
    }
    public static boolean AscendingSequence (int N){
        int[] numeros=LerEguardarNumeros(N);
        boolean ascending=true;
        for (int i = 1; i < numeros.length ; i++) {
            if(numeros[i]>numeros[i-1] && ascending==true){
                ascending=true;
            }else{
                ascending=false;
            }
        }
        return ascending;
    }
}
