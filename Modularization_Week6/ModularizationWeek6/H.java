import java.util.Scanner;
public class H {
    public static void main(String[]args){
        final int MAX_TENTATIVAS=5;
        Scanner ler=new Scanner(System.in);
        int num= ler.nextInt(), tentativas=1;
        boolean verify;
        verify=palindrome(num);
        while (!verify && tentativas<MAX_TENTATIVAS){
            tentativas++;
            num= ler.nextInt();
            verify=palindrome(num);
        }
        if(verify){
            System.out.println("palindrome");
        } else {
            System.out.println("attempts exceeded");
        }
    }
    public static boolean palindrome (int num){
        int numCopia, numInvertido=0, digito;
        boolean palindrome=false;
        numCopia=num;
        do{
            digito=num%10;
            num=num/10;
            numInvertido=numInvertido*10+digito;
        }while(num!=0);
        if(numInvertido==numCopia){
            palindrome=true;
        }
        return palindrome;
    }
}