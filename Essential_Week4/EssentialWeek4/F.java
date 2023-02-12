import java.util.Scanner;
public class F {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int numero, numeroCopia, numeroInvertido=0, digito;
        boolean capicua;
        numero= ler.nextInt();
        if(numero>0){
            numeroCopia=numero;
            while (numero>0){
                digito=numero%10;
                numero=numero/10;
                numeroInvertido=numeroInvertido*10+digito;
            }
            if(numeroCopia==numeroInvertido){
                capicua=true;
            }else{
                capicua=false;
            }
            if(capicua==true){
                System.out.println("palindrome");
            }else {
                System.out.println("not palindrome");
            }
        }
    }
}