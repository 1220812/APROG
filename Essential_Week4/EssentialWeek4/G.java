import java.util.Scanner;
public class G {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int numero, contadorDivisores=0;
        numero= ler.nextInt();
        for (int divisor =1 ; divisor <=numero ; divisor++) {
            if(numero%divisor==0){
                contadorDivisores++;
                System.out.println(divisor);
            }
        }
        System.out.println("("+contadorDivisores+")");
    }
}