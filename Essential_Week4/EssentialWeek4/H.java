import java.util.Scanner;
public class H {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int numero, quantidadeDivisores=0;
        boolean primo;
        numero= ler.nextInt();
        for (int divisor = 1; divisor <=numero ; divisor++) {
            if(numero%divisor==0){
                quantidadeDivisores++;
            }
        }
        if(quantidadeDivisores!=2){
            primo=false;
        }else{
            primo=true;
        }
        if(primo){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}