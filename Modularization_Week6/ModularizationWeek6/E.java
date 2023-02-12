import java.util.Scanner;
public class E {
    public static void main(String[]args){
        Scanner ler =new Scanner(System.in);
        int N, num1, num2, maisDigitosPosicoesComuns=0, copiaNumero1=0, copiaNumero2=0;
        do{
            N= ler.nextInt();
        }while (N<=0);
        for (int par = 0; par <N ; par++) {
            num1= ler.nextInt();
            num2= ler.nextInt();
            if (countDigitsAtSamePositions(num1,num2)>=maisDigitosPosicoesComuns){
                maisDigitosPosicoesComuns=countDigitsAtSamePositions(num1,num2);
                copiaNumero1=num1;
                copiaNumero2=num2;
            }
        }if(maisDigitosPosicoesComuns==0){
            System.out.println("no results");
        }else {
            System.out.println(copiaNumero1 + "/" + copiaNumero2);
        }
    }
    public static int countDigitsAtSamePositions (int num1, int num2){
        int contador=0, digito1, digito2;
        do{
            digito1=num1%10;
            digito2=num2%10;
            if(digito1==digito2){
                contador++;
            }
            num1=num1/10;
            num2=num2/10;
        }while (num1>0 && num2>0);
        return contador;
    }
}