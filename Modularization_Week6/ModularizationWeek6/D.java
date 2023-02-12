import java.util.Scanner;
public class D {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int m, n;
        m= ler.nextInt();
        n= ler.nextInt();
        if(m>=n){
            System.out.println("C("+m+","+n+") ="+combinations(m,n));
            System.out.println("P("+m+";"+n+") ="+permutations(m,n));
        }
    }
    public static int factorial(int numero){
        int factorial=1;
        for (int i = numero; i >0 ; i--) {
            factorial=factorial*i;
        }
        return factorial;
    }
    public static int combinations(int m, int n){
        int combinations;
        combinations=factorial(m)/(factorial(n)*factorial(m-n));
        return combinations;
    }
    public static int permutations(int m, int n){
        int permutations;
        permutations=factorial(m)/factorial(m-n);
        return permutations;
    }
}