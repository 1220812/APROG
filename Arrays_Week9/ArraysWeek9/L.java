import java.util.Scanner;
public class L {
    static Scanner ler=new Scanner(System.in);
    static final int MAXIMO_NUMEROS_A_LER=30;
    public static void main(String[]args){
        int[] numeros=LerEarmazenarNumeros();
        MostrarNumerosMaioresQueVizinhos(numeros);
    }
    public static int[] LerEarmazenarNumeros (){
        int[] numeros=new int[30];
        int quantidadeNumeros=0, numero;
        numero= ler.nextInt();
        while (numero>0 && quantidadeNumeros<MAXIMO_NUMEROS_A_LER){
            numeros[quantidadeNumeros]=numero;
            quantidadeNumeros++;
            numero= ler.nextInt();
        }
        return numeros;
    }
    public static void MostrarNumerosMaioresQueVizinhos(int[] numeros){
        for (int i = 1; i <numeros.length-1 ; i++) {
            if(numeros[i]>numeros[i-1] && numeros[i]>numeros[i+1] && numeros[i+1]!=0){
                System.out.println(numeros[i]);
            }
        }
    }
}
