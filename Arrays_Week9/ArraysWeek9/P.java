import java.util.Scanner;
public class P {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (somaFatoriais(i) > X) {
                count++;
            }
        }
        System.out.printf("%d", count);
    }
    public static int somaFatoriais(int num) {
        int soma = 0;
        while (num > 0) {
            int digito = num % 10;
            soma += fatorial(digito);
            num /= 10;
        }
        return soma;
    }
    public static int fatorial(int num) {
        int resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}