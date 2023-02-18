import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrabalhoDeGrupo {
    static Scanner ler = new Scanner(System.in);
    static final int M = 20;
    static final int H = 30;
    static final int E = 40;
    static final int TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER = 50;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\Utilizador\\IdeaProjects\\APROG\\Trabalho_De_Grupo\\TrabalhoDeGrupo\\DadosTrabalho"));
        file.nextLine();
        int L = file.nextInt();
        int C = file.nextInt();
        int[][] MT = new int[L][C];
        String[][] copiaMatrizMA = new String[L][C];
        LerEArmazenarTemperaturas(MT, L, C, file);
        System.out.println("b)");
        MostrarMT(MT, L, C);
        String[][] MA = new String[L][C];
        ObterMA(MT, L, C, MA);
        System.out.println("c)");
        MostrarMA(MA, L, C);
        System.out.println("d)");
        int alteracaoTemperaturaD = -10;
        ObterMTdepoisDaAlteracaoDaTemperatura(MT, L, C, alteracaoTemperaturaD);
        MostrarMT(MT, L, C);
        ObterMA(MT, L, C, MA);
        ObterCopiaMatrizMA(MA, L, C, copiaMatrizMA);
        MostrarMA(MA, L, C);
        System.out.println("e)");
        double areaTotalTerreno = ContarAreaTotalTerreno(L, C);
        double areaTerrenoNivelM = ContarAreaEmNivelM(MA, L, C);
        double areaTerrenoNivelH = ContarAreaEmNivelH(MA, L, C);
        double areaTerrenoNivelE = ContarAreaEmNivelE(MA, L, C);
        double areaTerrenoNivelC = ContarAreaEmNivelC(MA, L, C);
        System.out.printf("Moderate : %.2f%%", CalcularPercentagem(areaTotalTerreno, areaTerrenoNivelM));
        System.out.println();
        System.out.printf("High : %.2f%%", CalcularPercentagem(areaTotalTerreno, areaTerrenoNivelH));
        System.out.println();
        System.out.printf("Extreme : %.2f%%", CalcularPercentagem(areaTotalTerreno, areaTerrenoNivelE));
        System.out.println();
        System.out.printf("Catastrophic : %.2f%%", CalcularPercentagem(areaTotalTerreno, areaTerrenoNivelC));
        System.out.println();
        System.out.println();
        System.out.println("f)");
        int temperaturaMinima = CalcularTemperaturaMinima(MT, L, C);
        MostrarAumentoTemperaturaParaQueTodoTerrenoFiqueEmC(temperaturaMinima);
        System.out.println();
        System.out.println("g)");
        int alteracaoTemperaturaG = 10;
        ObterMTdepoisDaAlteracaoDaTemperatura(MT, L, C, alteracaoTemperaturaG);
        ObterMA(MT, L, C, MA);
        MostrarMA(MA, L, C);
        int niveisAlertaDiferentes = ContarNiveisAlertaDiferentes(MA, L, C, copiaMatrizMA);
        System.out.printf("Alert levels change due to temperature variations by %dºC : %.2f%%", alteracaoTemperaturaG, CalcularPercentagem(areaTotalTerreno, niveisAlertaDiferentes));
        System.out.println();
        System.out.println("h)");
        ObterMApeloAgravamentoDoVento(MA, L, C);
        MostrarMA(MA, L, C);
        System.out.println("i)");
        MostrarMT(MT, L, C);
        CalcularCoordenadasTerrenoOndeDeveSerDespejadaAgua(MT, L, C);
        System.out.println();
        System.out.println("j)");
        MostrarColunasSeguras(MA, L, C);
        file.close();
    }

    public static void LerEArmazenarTemperaturas(int[][] MT, int L, int C, Scanner file) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                MT[i][j] = file.nextInt();
            }
        }
    }

    public static void MostrarMT(int[][] MT, int L, int C) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.printf("%4d", MT[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ObterMA(int[][] MT, int L, int C, String[][] MA) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (MT[i][j] < M) {
                    MA[i][j] = "M";
                } else if (MT[i][j] < H) {
                    MA[i][j] = "H";
                } else if (MT[i][j] < E) {
                    MA[i][j] = "E";
                } else {
                    MA[i][j] = "C";
                }
            }
        }
    }

    public static void MostrarMA(String[][] MA, int L, int C) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(MA[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ObterMTdepoisDaAlteracaoDaTemperatura(int[][] MT, int L, int C, int alteracaoDaTemperatura) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                MT[i][j] += alteracaoDaTemperatura;
            }
        }
    }

    public static double ContarAreaTotalTerreno(int L, int C) {
        double areaTotalTerreno = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                areaTotalTerreno++;
            }
        }
        return areaTotalTerreno;
    }

    public static double ContarAreaEmNivelM(String[][] MA, int L, int C) {
        double areaTerrenoNivelM = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (MA[i][j].equals("M")) {
                    areaTerrenoNivelM++;
                }
            }
        }
        return areaTerrenoNivelM;
    }

    public static double ContarAreaEmNivelH(String[][] MA, int L, int C) {
        double areaTerrenoNivelH = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (MA[i][j].equals("H")) {
                    areaTerrenoNivelH++;
                }
            }
        }
        return areaTerrenoNivelH;
    }

    public static double ContarAreaEmNivelE(String[][] MA, int L, int C) {
        double areaTerrenoNivelE = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (MA[i][j].equals("E")) {
                    areaTerrenoNivelE++;
                }
            }
        }
        return areaTerrenoNivelE;
    }

    public static double ContarAreaEmNivelC(String[][] MA, int L, int C) {
        double areaTerrenoNivelC = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (MA[i][j].equals("C")) {
                    areaTerrenoNivelC++;
                }
            }
        }
        return areaTerrenoNivelC;
    }

    public static double CalcularPercentagem(double areaTerrenoTotal, double areaTerrenoNivelAlerta) {
        double percentagem;
        percentagem = (areaTerrenoNivelAlerta * 100) / areaTerrenoTotal;
        return percentagem;
    }

    public static int CalcularTemperaturaMinima(int[][] MT, int L, int C) {
        int temperaturaMinima = MT[0][0];
        for (int i = 0; i < L; i++) {
            for (int j = 1; j < C; j++) {
                if (MT[i][j] < temperaturaMinima) {
                    temperaturaMinima = MT[i][j];
                }
            }
        }
        return temperaturaMinima;
    }

    public static void MostrarAumentoTemperaturaParaQueTodoTerrenoFiqueEmC(int temperaturaMinima) {
        int temperaturaNecessaria;
        temperaturaNecessaria = E - temperaturaMinima;
        System.out.println("To get all terrain on CATASTROPHIC alert, the temperature has to rise : " + temperaturaNecessaria + " ºC");
    }

    public static void ObterCopiaMatrizMA(String[][] MA, int L, int C, String[][] copiaMatrizMA) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                copiaMatrizMA[i][j] = MA[i][j];
            }
        }
    }

    public static int ContarNiveisAlertaDiferentes(String[][] MA, int L, int C, String[][] copiaMatrizMA) {
        int niveisAlertaDiferentes = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                if (!MA[i][j].equals(copiaMatrizMA[i][j])) {
                    niveisAlertaDiferentes++;
                }
            }
        }
        return niveisAlertaDiferentes;
    }

    public static void ObterMApeloAgravamentoDoVento(String[][] MA, int L, int C) {
        for (int i = L - 2; i >= 0; i--) {
            for (int j = 0; j < C; j++) {
                if (MA[i][j].equals("C")) {
                    MA[i + 1][j] = "C";
                }
            }
        }
    }

    public static void CalcularCoordenadasTerrenoOndeDeveSerDespejadaAgua(int[][] MT, int L, int C) {
        int locaisPotencialmenteArder, copiaLinha = 0, copiaColuna = 0, localMaisApropriadoDespejarAgua = 0;
        for (int i = 1; i < L - 1; i++) {
            for (int j = 1; j < C - 1; j++) {
                locaisPotencialmenteArder = 0;
                if (MT[i - 1][j - 1] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (MT[i - 1][j] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (MT[i - 1][j + 1] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (MT[i][j - 1] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (MT[i][j] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (MT[i][j + 1] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (MT[i + 1][j - 1] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (MT[i + 1][j] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (MT[i][j + 1] > TEMPERATURA_LOCAL_POTENCIALMENTE_A_ARDER) {
                    locaisPotencialmenteArder++;
                }
                if (localMaisApropriadoDespejarAgua < locaisPotencialmenteArder) {
                    copiaLinha = i;
                    copiaColuna = j;
                    localMaisApropriadoDespejarAgua = locaisPotencialmenteArder;
                }
            }
        }
        if (localMaisApropriadoDespejarAgua == 0) {
            System.out.println("no fire");
        } else {
            System.out.println("drop water at (" + copiaLinha + " , " + copiaColuna + ")");
        }
    }

    public static void MostrarColunasSeguras(String[][] MA, int L, int C) {
        int colunaSafe = 0;
        for (int i = C - 1; i >= 0; i--) {
            int colunasNivelCatastrofico = 0;
            for (int j = 0; j < L; j++) {
                if (MA[j][i].equals("C"))
                    colunasNivelCatastrofico += 1;
            }
            if (colunasNivelCatastrofico == 0) {
                System.out.println("colunaSafe column = (" + i + ")");
                colunaSafe = 1;
                i = -1;
            }
        }
        if (colunaSafe == 0)
            System.out.println("colunaSafe column = NONE");
    }
}