import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] conjuntoNumeros = new int[20];
        int numero, position = 0;
        numero = ler.nextInt();
        if(numero>0) {
            while (numero > 0) { // Preencher Array
                conjuntoNumeros[position] = numero;
                position++;
                numero = ler.nextInt();
            }
            System.out.println("min=" + EncontrarMinimo(conjuntoNumeros));
            System.out.println("occurrences=" + ContarOcorrencias(conjuntoNumeros));
        }
    }

    public static int EncontrarMinimo(int[] numeros) {
        int minimo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo && numeros[i]!=0) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }

    public static int ContarOcorrencias(int[] numeros) {
        int ocorrencias = 0, minimo=EncontrarMinimo(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == minimo) {
                ocorrencias++;
            }
        }
        return ocorrencias;
    }
}
