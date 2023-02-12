import java.util.Scanner;
public class K {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int pontuacao, numero, numeroInvertido;
        numero= ler.nextInt();
        numeroInvertido=inverterNumero(numero);
        pontuacao=pontuacao(numeroInvertido);
        System.out.println("points="+pontuacao);
    }
    public static int inverterNumero(int num){
        int digito, numeroInvertido=0;
        do{
            digito=num%10;
            num/=10;
            numeroInvertido=numeroInvertido*10+digito;
        }while (num!=0);
        return numeroInvertido;
    }
    public static int pontuacao (int numInvertido){
        int digito1=numInvertido%10, digito2;
        boolean SequenciaRepetida=false;
        numInvertido=numInvertido/10;
        int pontuacao=digito1;
        do{
            digito2=numInvertido%10;
            numInvertido=numInvertido/10;
            if(digito1==digito2 && SequenciaRepetida){ // verificar se o número tem vários digitos repetidos seguidos
                pontuacao=pontuacao-digito2; // caso se verifique apenas se subtrai o digito à pontuação (que já está negativa das verificações anteriores)
            }else if(digito1==digito2){
                pontuacao=-pontuacao-digito2;
                SequenciaRepetida=true;
            }else{
                pontuacao=pontuacao+digito2;
            }
            digito1=digito2;
        }while(numInvertido!=0);
        return pontuacao;
    }
}