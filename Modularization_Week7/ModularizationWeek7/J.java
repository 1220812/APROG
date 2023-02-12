import java.util.Scanner;
public class J {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int num= ler.nextInt();
        if(num<=100){
            System.out.println("triples="+CalcularTriplas(num));
        }
    }
    public static int CalcularTriplas(int num){
        int quantidadeTriplas=0;
        for (int termo1 = num-2; termo1>1 ; termo1--) {
            for (int termo2 = termo1 ; termo2 >=1 ; termo2--) {
                for (int termo3 = termo2; termo3 >=1 ; termo3--) {
                    int somaTriplas=0;
                    somaTriplas=termo1+termo2+termo3;
                    if (somaTriplas==num){
                        System.out.println(termo1+" + "+termo2+" + "+termo3);
                        quantidadeTriplas++;
                    }
                }
            }
        }
        return quantidadeTriplas;
    }
}