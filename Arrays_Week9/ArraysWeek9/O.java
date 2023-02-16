import java.util.Scanner;

public class O {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        do {
            N = ler.nextInt();
        } while (N < 2 || N > 20);
        int[][] matriz = new int[N][N];
        int[][] matrizSomaQuadrantes=new int[2][2];
        LerEguardarNumeros(matriz);
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.printf("[%d]",CalcularSomaQuadrante(matriz)[i][j]);
            }
            System.out.println();
        }
    }

    public static void LerEguardarNumeros(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
    }

    public static void GuardarSomasQuadrantesMatrizOrdemPar (int[][] matriz, int[][] matrizSomaQuadrantes) {
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = matriz.length / 2; j < matriz.length; j++) {
                q1 = q1+matriz[i][j];
            }
        }
        matrizSomaQuadrantes[0][1] = q1;
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = 0; j < matriz.length / 2; j++) {
                q2 = q2+matriz[i][j];
            }
        }
        matrizSomaQuadrantes[0][0] = q2;
        for (int i = matriz.length / 2; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length / 2; j++) {
                q3 = q3+matriz[i][j];
            }
        }
        matrizSomaQuadrantes[1][0] = q3;
        for (int i = matriz.length / 2 ; i < matriz.length; i++) {
            for (int x = matriz.length / 2 ; x < matriz.length; x++) {
                q4 =q4+ matriz[i][x];
            }
        }
        matrizSomaQuadrantes[1][1] = q4;
    }

    public static void GuardarSomasQuadrantesMatrizOrdemImpar (int[][] matriz, int[][] matrizSomaQuadrantes) {
        int q1=0, q2=0, q3=0, q4=0;
        for (int i = 0; i < matriz.length/2 ; i++) {
            for (int j = 0; j < matriz.length/2 ; j++) {
                q2=q2+matriz[i][j];
            }
        }
        matrizSomaQuadrantes[0][0]=q2;
        for (int i = 0; i < matriz.length/2 ; i++) {
            for (int j = (matriz.length/2)+1; j < matriz.length; j++) {
                q1=q1+matriz[i][j];
            }
        }
        matrizSomaQuadrantes[0][1]=q1;
        for (int i = (matriz.length/2)+1; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length/2 ; j++) {
                q3=q3+matriz[i][j];
            }
        }
        matrizSomaQuadrantes[1][0]=q3;
        for (int i = (matriz.length/2)+1; i < matriz.length; i++) {
            for (int j = (matriz.length/2)+1; j < matriz.length ; j++) {
                q4=q4+matriz[i][j];
            }
        }
        matrizSomaQuadrantes[1][1]=q4;
    }
    public static int[][] CalcularSomaQuadrante (int[][] matriz){
        int[][] matrizSomaQuadrantes=new int[2][2];
        if(matriz.length%2==0){
            GuardarSomasQuadrantesMatrizOrdemPar(matriz,matrizSomaQuadrantes);
            }else{
            GuardarSomasQuadrantesMatrizOrdemImpar(matriz,matrizSomaQuadrantes);
        }
        return matrizSomaQuadrantes;
    }
}