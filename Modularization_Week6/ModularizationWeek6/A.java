import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N, numero;
        final int K = 5;
        double media = 0, soma = 0, quantidadeNumeros = 0;
        System.out.print("Introduza o valor de N: ");
        N = ler.nextInt();
        numero = ler.nextInt();
        while (contarDigitos(numero) < N && quantidadeNumeros<K) {
            quantidadeNumeros++;
            soma = soma + numero;
            if(quantidadeNumeros<K) {
                numero = ler.nextInt();
            }
        }
        if(quantidadeNumeros>0) {
            media = soma / quantidadeNumeros;
        }else {
            media=soma;
        }
        System.out.printf("%.2f", media);
    }

    public static int contarDigitos(int numero) {
        int contadorDigitos = 0;
        while (numero > 0) {
            numero = numero / 10;
            contadorDigitos++;
        }
        return contadorDigitos;
    }
}