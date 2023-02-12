import java.util.Scanner;
public class B {
    public static void main(String []args){
        int numero, digito, soma=0;
        Scanner ler=new Scanner(System.in);
        numero= ler.nextInt();
        while (numero>0){
            while (numero>0){
                digito=numero%10;
                numero=numero/10;
                if(digito%2==0){
                    soma=soma+digito;
                }
            }
            System.out.println(soma);
            soma=0;
            numero= ler.nextInt();
        }
    }
}