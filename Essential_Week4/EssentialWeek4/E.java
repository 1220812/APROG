import java.util.Scanner;
public class E {
    public static void main(String[]args){
        int octal, digito, decimal=0, ordem=0;
        Scanner ler=new Scanner(System.in);
        octal=ler.nextInt();
        while (octal>0){
            while (octal>0){
                digito=octal%10;
                octal=octal/10;
                decimal= (int) ((double) decimal+digito*Math.pow(8,ordem));
                ordem++;
            }
            System.out.println(decimal);
            decimal=0;
            ordem=0;
            octal= ler.nextInt();
        }
    }
}