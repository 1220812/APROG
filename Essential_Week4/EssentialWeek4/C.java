import java.util.Scanner;
public class C {
    public static void main(String[]args){
        int numero, digito, produto=1, contadorImpares=0;
        Scanner ler=new Scanner(System.in);
        numero= ler.nextInt();
        while (numero>0){
            digito=numero%10;
            numero=numero/10;
            if(digito%2!=0){
                contadorImpares++;
                produto=produto*digito;
            }
        }
        if(contadorImpares==0){
            System.out.println("no odd digits");
        }else{
            System.out.println(produto);
        }
    }
}