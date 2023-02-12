import java.util.Scanner;
public class Y {
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        int numero1,menor,numero2, maior;
        numero1=ReadPositiveValue();
        numero2=ReadPositiveValue();
        if(numero1>numero2){
            maior=numero1;
            menor=numero2;
        }else{
            maior=numero2;
            menor=numero1;
        }
        ShowTablesInRange(menor,maior);
    }
    public static int ReadPositiveValue (){
        int num;
        do{
            num= ler.nextInt();
        }while (num<=0);
        return num;
    }
    public static void ShowTablesInRange (int minimo, int maximo){
        for (int i = minimo; i <= maximo; i++) {
            System.out.println("Multiplication table of "+i);
            ShowTablesOfNumber(i);
        }
    }
    public static void ShowTablesOfNumber(int num){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}