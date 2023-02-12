import java.util.Scanner;
public class G {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int N= ler.nextInt();
        boolean verify;
        for (int i = 0; i <N ; i++) {
            verify=Armstrong(i);
            if(verify){
                System.out.println(i);
            }
        }
    }
    public static int ContarDigitos (int num){
        int contador=0;
        do{
            num=num/10;
            contador++;
        }while (num!=0);
        return contador;
    }
    public static boolean Armstrong (int num){
        boolean verify;
        int numCopia, digito, numeroSoma=0;
        numCopia=num;
        do{
            digito=num%10;
            num=num/10;
            numeroSoma += Math.pow(digito, ContarDigitos(numCopia));
        }while (num!=0);
        if (numCopia==numeroSoma){
            verify=true;
        }else{
            verify=false;
        }
        return verify;
    }
}