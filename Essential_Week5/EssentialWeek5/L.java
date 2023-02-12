import java.util.Scanner;
public class L {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int N, somaDivisores=0, quantidadePerfeitos=0;
        boolean perfeito;
        N= ler.nextInt();
        for (int numero = 2; quantidadePerfeitos <N ; numero++) {
            for (int divisor = 1; divisor <numero ; divisor++) {
                if(numero%divisor==0){
                    somaDivisores=somaDivisores+divisor;
                }
            }
            if(numero==somaDivisores){
                perfeito=true;
            }else{
                perfeito=false;
            }
            if (perfeito){
                quantidadePerfeitos++;
                System.out.println(numero);
            }
            somaDivisores=0;
        }
    }
}