import java.util.Scanner;
public class Y {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, divisoresMultiplos3 = 0;
        boolean multiplo3;
        numero = ler.nextInt();
        for (int divisor = 1; divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                if (divisor % 3 == 0) {
                    multiplo3 = true;
                    divisoresMultiplos3++;
                } else {
                    multiplo3 = false;
                }
                if (multiplo3) {
                    System.out.println(divisor);
                }
            }
        }
        if (divisoresMultiplos3 == 0) {
            System.out.println("Without dividers multiples of 3");
        }
    }
}