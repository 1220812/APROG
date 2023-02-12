import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        double contadorNumeros = 0, contadorPositivos = 0, contadorNegativos = 0, contadorUniqueDigits = 0;
        num = ler.nextInt();
        while (num != 0) {
            contadorNumeros++;
            if (UniqueDigits(num)==0) {
                contadorUniqueDigits++;
                System.out.println(num);
            }
            if (num > 0) {
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }
            num = ler.nextInt();
        }
        if (contadorNumeros != 0) {
            System.out.printf("negatives: %.2f%%\n", calcularPercentagens(contadorNegativos, contadorNumeros));
            System.out.printf("positives: %.2f%%\n", calcularPercentagens(contadorPositivos, contadorNumeros));
            System.out.printf("with uniques digits: %.2f%%\n", calcularPercentagens(contadorUniqueDigits, contadorNumeros));
        }
    }

    public static int UniqueDigits(int num) {
        int digito1, digito2, numCopia, num2 ,posicao1 = 0, posicao2,digitosRepetidos=0;
        num2 = num;
        while (num2 != 0 && digitosRepetidos==0) { // caso tenham sido registados digitos repetidos nos estudos anteriores, a verificação acaba
            posicao1++;
            digito1 = num2 % 10;
            num2/= 10;
            numCopia=num;
            posicao2=0;
            while (numCopia != 0 && digitosRepetidos==0) { // caso tenham sido registados digitos repetidos nos estudos anteriores, a verificação acaba
                posicao2++;
                digito2 = numCopia % 10;
                numCopia /= 10;
                if (digito1 == digito2 && posicao1 != posicao2) {
                    digitosRepetidos++;
                }
            }
        }
        return digitosRepetidos;
    }

    public static double calcularPercentagens(double contador, double contadorNumeros) {
        double percentagem;
        percentagem = (contador / contadorNumeros) * 100;
        return percentagem;
    }
}