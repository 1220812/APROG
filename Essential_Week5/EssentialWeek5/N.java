import java.util.Scanner;
public class N {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int numero1, numero2, numeroCopia, digito1, digito2;
        boolean crescente;
        numero1= ler.nextInt();
        while(numero1>=0){
            numero2= ler.nextInt();
            crescente=false;
            if(numero2>numero1){
                numeroCopia=numero2;
                while (numeroCopia>0){
                    digito1=numeroCopia%10;
                    digito2=(numeroCopia/10)%10;
                    numeroCopia=numeroCopia/10;
                    if (digito2<digito1){
                        crescente=true;
                    }else{
                        crescente=false;
                        break; // caso seja detetado que o número não é uma sequência crescente, o programa para de verificar se os outros digitos estão por ordem crescente
                    }
                }
            }
            numero1=numero2;
            if(crescente){
                System.out.println(numero2);
            }
        }
    }
}