import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Recurso_2020 {
    static final int DIAS = 7;
    static final int HORAS = 24;
    static final int HORA_INICIO=8;
    static final int HORA_FIM=18;
    static final int TEMPERATURA_PARA_LIGAR=10;
    static final int TEMPERATURA_PARA_APAGAR=20;

    public static void main(String[] args) throws FileNotFoundException {
        double[][] temperaturas;
        String nomeFicheiro = "C:\\Users\\Utilizador\\IdeaProjects\\APROG\\Exames\\Exames\\temperaturaSemana.txt";
        temperaturas = lerTemperaturaDoFicheiro(nomeFicheiro);
        System.out.println("Número de vezes que o aquecimento foi ligado no dia 3: " + ligacoesDoAquecimentoNoDia(temperaturas, 2));
        String[] arrayLigarAquecimento = sugestaoParaLigarAquecimentoAsHoras(temperaturas);
        for (int i = 0; i < HORAS; i++) {
            System.out.println(arrayLigarAquecimento[i]+" ");
        }
    }

    private static double[][] lerTemperaturaDoFicheiro(String nomeFicheiro) throws FileNotFoundException {
        double[][] temperaturas = new double[DIAS][HORAS];
        String[] linha;
        File ficheiro = new File(nomeFicheiro);
        Scanner ler = new Scanner(ficheiro);
        int numeroSemanas = 0;
        while (ler.hasNextLine()) {
            linha = ler.nextLine().split(" ");
            for (int i = 0; i < HORAS; i++) {
                temperaturas[numeroSemanas][i] = Double.parseDouble(linha[i]);
            }
            numeroSemanas++;
        }
        ler.close();
        return temperaturas;
    }

    private static int ligacoesDoAquecimentoNoDia(double[][] temperaturas, int dia) {
        boolean aquecimento = false;
        int horasAquecimentoLigado = 0;
        for (int i = HORA_INICIO; i <= HORA_FIM; i++) {
            if (!aquecimento && temperaturas[dia][i] < TEMPERATURA_PARA_LIGAR) {
                aquecimento = true;
                horasAquecimentoLigado++;
            } else if (aquecimento && temperaturas[dia][i] > TEMPERATURA_PARA_APAGAR) {
                aquecimento = false;
            }
        }
        return horasAquecimentoLigado;
    }

    private static String[] sugestaoParaLigarAquecimentoAsHoras(double[][] temperaturas) {
        String[] trueOrFalse = new String[HORAS];
        for (int i = 0; i < HORAS; i++) {
            boolean ligar = false;
            int diasDaSemanaAquecedorLigado = 0;
            for (int j = 0; j < DIAS; j++) {
                if (temperaturas[j][i] < TEMPERATURA_PARA_LIGAR){
                    diasDaSemanaAquecedorLigado++;
                }
            }
            if (diasDaSemanaAquecedorLigado == DIAS){
                ligar = true;
            }
            if (ligar){
                trueOrFalse[i] = "T";
            }else{
                trueOrFalse[i] = "F";
            }
        }
        return trueOrFalse;
    }
}