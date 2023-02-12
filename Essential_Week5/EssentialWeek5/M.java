import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N, termo1 = 0, termo2 = 1, termoSeguinte, termosFibonacci = 2;
        N = ler.nextInt();
        if (N > 0) {
            if (N == 1) {
                System.out.println(0);
            } else if (N == 2) {
                System.out.println(0);
                System.out.println(1);
            } else {
                System.out.println(0);
                System.out.println(1);
                while (termosFibonacci < N) {
                    termoSeguinte = termo1 + termo2;
                    termosFibonacci++;
                    termo1 = termo2;
                    termo2 = termoSeguinte;
                    System.out.println(termoSeguinte);
                }
            }
        }
    }
}