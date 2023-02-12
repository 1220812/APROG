import java.util.Scanner;
public class I {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int numeroA, numeroB, maiorNumero, menorNumero, MMC;
        boolean MMCencontrado=false;
        numeroA= ler.nextInt();
        numeroB= ler.nextInt();
        if (numeroA>numeroB){
            maiorNumero=numeroA;
            menorNumero=numeroB;
        }else{
            maiorNumero=numeroB;
            menorNumero=numeroA;
        }
        if(maiorNumero%menorNumero==0){
            MMC=maiorNumero;
        }else{
            MMC=maiorNumero;
            while (MMCencontrado==false){
                if (MMC%menorNumero==0 && MMC%maiorNumero==0){
                    MMCencontrado=true;
                }else{
                    MMC++;
                }
            }
        }
        System.out.println(MMC);
    }
}