import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EpocaNormal_2020 {
    static final int NUMERO_FILAS=24;
    static final int NUMERO_LUGARES_POR_FILA=30;
    static final int ULTIMA_FILA_ZONA1=7;
    static final int PRECO_ZONA1=20;
    static final int ULTIMA_FILA_ZONA2=15;
    static final int PRECO_ZONA2=15;
    static final int PRECO_ZONA3=10;
    public static void main(String[]args) throws FileNotFoundException{
        String nomeFicheiro="C:\\Users\\Utilizador\\IdeaProjects\\APROG\\Exames\\Exames\\ocupacaoSala2020-01-14.txt";
        int [][] lugares;
        int numeroLugaresPretendidos=4;
        lugares=lerOcupacaoDaSala(nomeFicheiro);
        System.out.printf("A bilheteira gerou %d €",calcularBilheteira(lugares));
        System.out.println();
        System.out.println(informarLugares(lugares,numeroLugaresPretendidos));
    }
    public static int[][] lerOcupacaoDaSala (String nomeFicheiro) throws FileNotFoundException {
        int[][] lugares=new int[NUMERO_FILAS][NUMERO_LUGARES_POR_FILA];
        String[] linha;
        File ficheiro=new File(nomeFicheiro);
        Scanner input=new Scanner(ficheiro);
        int numeroLinhas=0;
        while (input.hasNextLine()){
            linha=input.nextLine().split(";");
            for (int i = 0; i < NUMERO_LUGARES_POR_FILA; i++) {
                    lugares[numeroLinhas][i] = Integer.parseInt(linha[i+1]);
                }
            numeroLinhas++;
            }
        input.close();
        return lugares;
        }
        public static int calcularBilheteira (int[][] lugares){
        int receitaGeradaBilheteira=0;
            for (int i = 0; i < NUMERO_FILAS ; i++) {
                for (int j = 0; j < NUMERO_LUGARES_POR_FILA ; j++) {
                    if(lugares[i][j]==1 && i<=ULTIMA_FILA_ZONA1){
                        receitaGeradaBilheteira+=PRECO_ZONA1;
                    }else if(lugares[i][j]==1 && i<=ULTIMA_FILA_ZONA2){
                        receitaGeradaBilheteira+=PRECO_ZONA2;
                    } else if (lugares[i][j]==1) {
                        receitaGeradaBilheteira+=PRECO_ZONA3;
                    }
                }
            }
            return receitaGeradaBilheteira;
        }
    private static int informarLugares(int[][] lugares, int numeroLugaresConsecutivosPretendidos) {
        boolean verificacaoLugaresDisponiveis = true;
        for (int i = NUMERO_FILAS-1; i >= 0; i--) {
            for (int j = 0; j < NUMERO_LUGARES_POR_FILA-numeroLugaresConsecutivosPretendidos; j++) {
                for (int a = 1; a <= numeroLugaresConsecutivosPretendidos; a++) {
                    verificacaoLugaresDisponiveis = lugares[i][j] == 0 && lugares[i][j + a] == 0;
                }
                if (verificacaoLugaresDisponiveis) {
                    return i;
                }
            }
        }
        return -1;
    }
    }