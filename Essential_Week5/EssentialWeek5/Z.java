import java.util.Scanner;
public class Z {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int numero, digito, maiorImpar=0;
        double percentagemPares, digitosPares=0, digitosImpares=0, totalDigitos=0;
        numero= ler.nextInt();
        while (numero>0){
            digito=numero%10;
            numero=numero/10;
            totalDigitos++;
            if(digito%2==0){
                digitosPares++;
            }else{
                digitosImpares++;
                if(maiorImpar<digito){
                    maiorImpar=digito;
                }
            }
        }
        percentagemPares=(digitosPares/totalDigitos)*100;
        System.out.printf("%.2f%%",percentagemPares);
        System.out.println();
        if(digitosImpares>0){
            System.out.println(maiorImpar);
        }else{
            System.out.println("no odd digits");
        }
    }
}