import java.util.Scanner;
public class I {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int num= ler.nextInt();
        if (VerificarSeFibonacci(num)){
            System.out.println("is a Fibonacci number");
        }else{
            System.out.println("is not a Fibonacci number");
        }
    }
    public static boolean VerificarSeFibonacci (int num){
        int termo1=0, termo2=1, termoSeguinte;
        boolean fibonacci=false;
        do {
            termoSeguinte = termo1 + termo2;
            termo1 = termo2;
            termo2 = termoSeguinte;
        }while (termoSeguinte<num);
        if(num==termoSeguinte){
            fibonacci=true;
        }
        return fibonacci;
    }
}