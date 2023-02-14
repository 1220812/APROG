import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1, numero2, maiorNumero, menorNumero, contador = 0;
        numero1 = ler.nextInt();
        numero2 = ler.nextInt();
        if (numero1 > numero2) {
            menorNumero = numero2;
            maiorNumero = numero2;
        } else {
            menorNumero = numero1;
            maiorNumero = numero2;
        }
        for (int i = menorNumero; i <= maiorNumero; i++) {
            if (VerificarSePrimoTempoInteiro(i)) {
                contador++;
                System.out.println(i);
            }
        }
        System.out.println("(" + contador + ")");
    }

    public static boolean VerificarSePrimo(int num) {
        int divisores = 0;
        for (int divisor = 1; divisor <= num; divisor++) {
            if (num % divisor == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            return true;
        }
        return false;
    }

    public static boolean VerificarSePrimoTempoInteiro(int num) {
        int digitos = 0, copiaNum;
        copiaNum = num;
        do {
            digitos++;
            num /= 10;
        } while (num != 0);
        num = copiaNum;
        for (int i = 0; i < digitos; i++) {
            num = num / 10 + (num % 10 * (int) Math.pow(10, digitos - 1)); // corta o último digito do número e adiciona ao mesmo o produto entre o resto da divisão inteira do número por 10 com 10^(quantidade de digitos do número/10)
            /*
            Exemplo: num=12 (2 digitos);
            Para i=0:
            num=num/10 + (num % 10 * (int) Math.pow(10, digitos - 1)) -> 1(num/10) + 20 ( 2(num%10) * 10(10, 1(2-1)) = 21
            num=21
            Para i=1:
            num=num/10 + (num % 10 * (int) Math.pow(10, digitos - 1)) -> 2(num/10) + 10 ( 1(num%10) * 10(10, 1(2-1)) = 12
             */
            if (!VerificarSePrimo(num)) { // se qualquer um dos numeros provenientes da inversão dos digitos não for primo, então o número não é primo a tempo inteiro
                return false;
            }
        }
        return true;
    }
}