import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
    public class Recurso_2022 {
        static final int MAX_MESES = 6;
        static final int COLUNAS = 4;

        public static void main(String[] args) throws FileNotFoundException {
            String[] meses = new String[MAX_MESES];
            int[][] jogos = new int[MAX_MESES][COLUNAS];
            readInformationFromFile(meses, jogos);
            System.out.println("Mês com percentagem de vitórias maior: " + getTheMostVictoriousMonth(meses, jogos));
            System.out.println(Arrays.toString(getAverages(jogos)));
            writeStatistics(getAverages(jogos)[0], jogos, meses);

        }

        public static void readInformationFromFile(String[] meses, int[][] jogos) throws FileNotFoundException {
            String nomeficheiro = "C:\\Users\\Utilizador\\IdeaProjects\\APROG\\Exames\\Exames\\xadrez.txt";
            File ficheiro = new File(nomeficheiro);
            Scanner ler = new Scanner(ficheiro);
            String [] temp;
            for (int i = 0; i < MAX_MESES; i++) {
                temp = ler.nextLine().split(",");
                meses[i] = temp[0];
                for (int x = 0; x < COLUNAS; x++) {
                    jogos[i][x] = Integer.parseInt(temp[x+1]);
                }
            }
            ler.close();
        }

        public static String getTheMostVictoriousMonth(String[] meses, int[][] jogos) {
            int mesMaisVitorias = 0;
            double maiorPercentagemVitorias = (double) jogos[0][1] / jogos[0][0], percentagemVitoriasMes;

            for (int i = 1; i < jogos.length; i++) {
                percentagemVitoriasMes = (double) jogos[i][1] / jogos[i][0];
                if (percentagemVitoriasMes > maiorPercentagemVitorias) {
                    maiorPercentagemVitorias = percentagemVitoriasMes;
                    mesMaisVitorias = i;
                }
            }
            return meses[mesMaisVitorias];
        }

        public static double[] getAverages(int[][] jogos) {
            double[] medias = new double[COLUNAS];

            for (int i = 0; i < MAX_MESES; i++) {
                medias[0] += (double) jogos[i][0] / jogos.length; // jogos realizados
                medias[1] += (double) jogos[i][1] / jogos.length; // jogos ganhos
                medias[2] += (double) jogos[i][2] / jogos.length; // jogos perdidos
                medias[3] += (double) jogos[i][3] / jogos.length; // jogos empatados
            }
            return medias;
        }

        private static void writeStatistics(double mediajogos, int[][] jogos, String[] meses) {
            System.out.printf("Meses com mais de %.1f jogos%n", mediajogos);
            for (int i = 0; i < MAX_MESES; i++) {
                if (jogos[i][0] > mediajogos) {
                    System.out.printf("%s : %d%n", meses[i], jogos[i][0]);
                }
            }
        }
    }