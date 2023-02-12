import java.util.Scanner;
public class P{
    public static void main(String[]args){
        int numero1, digito1, digito2, numeroCopia, numero2, posicao1, posicao2;
        Scanner ler=new Scanner(System.in);
        boolean repetido;
        numero1= ler.nextInt();
        numeroCopia=numero1;
        while (numero1>0){
            repetido=false;
            posicao1=0;
            while (numero1!=0 && !repetido){ // segundo os outputs do exemplo, num número com vários algarismos iguais, só deve ser printada essa informação 1 vez, a primeira
                posicao1++;
                numero2=numeroCopia; // restabelecer o numero2 com o valor inicial, para que se possa voltar a verificar se existem algarismos iguais no número
                digito1=numero1%10;
                numero1=numero1/10;
                posicao2=0;
                while(numero2!=0 && !repetido){ // segundo os outputs do exemplo, num número com vários algarismos iguais, só deve ser printada essa informação 1 vez, a primeira
                    posicao2++;
                    digito2=numero2%10;
                    numero2=numero2/10;
                    if(digito1==digito2 && posicao1!=posicao2){
                        repetido=true;
                        System.out.println(numeroCopia+" : digit ("+digito1+") repeated in positions ("+posicao1+") and ("+posicao2+")");
                    }
                }
            }
            numero1= ler.nextInt();
            numeroCopia=numero1;
        }
    }
}