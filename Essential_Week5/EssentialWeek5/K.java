import java.util.Scanner;
public class K {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int N, quantidadeDivisores=0;
        boolean primo;
        N= ler.nextInt();
        for (int numero = 1; numero <=N ; numero++) {
            for (int divisor = 1; divisor <=numero ; divisor++) {
                if(numero%divisor==0){
                    quantidadeDivisores++;
                }
            }
            if(quantidadeDivisores==2){
                primo=true;
            }else{
                primo=false;
            }
            if(primo){
                System.out.println(numero);
            }
            quantidadeDivisores=0;
        }
    }
}