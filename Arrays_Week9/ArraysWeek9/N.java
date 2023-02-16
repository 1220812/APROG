import java.util.Scanner;

public class N {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        do {
            N = ler.nextInt();
        } while (N < 2 || N > 20);
        int[][] matriz = new int[N][N];
        LerEguardarNumeros(matriz);
        MostrarDiagonaisDireitaParaEsquerda(matriz);
    }
    public static void LerEguardarNumeros (int[][] matriz){
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                matriz[i][j]= ler.nextInt();
            }
        }
    }
    public static void MostrarDiagonaisDireitaParaEsquerda(int[][] matriz) {
        for (int i = matriz.length - 1; i >= 0; i--) {
            int linha = 0;
            for (int j = i; j <= matriz.length - 1; j++) {
                System.out.printf("[%d]", matriz[linha][j]);
                linha++;
            }
            System.out.println();
             /*
            Imprime, verticalmente, linha a linha da matriz com os valores da direita para a esquerda (do último até ao primeiro)
             */
        }
        for (int i = 1; i < matriz.length; i++) {
            int coluna = i;
            for (int j = 0; j < matriz.length - i; j++) {
                System.out.printf("[%d]", matriz[coluna][j]);
                coluna++;
            }
            System.out.println();
            /*
            Após a impressão de cada coluna, imprime a respetiva coluna (mesma ordem), a partir do segundo elemento desta até ao último
             */
        }
    }
}