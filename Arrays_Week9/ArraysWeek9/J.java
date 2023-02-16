import java.util.Scanner;

public class J {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nomes = new String[50];
        int[] salarios = new int[50];
        int numFuncionarios = LerEguardarNomes(nomes, salarios);
        int posicaoTop1 = EncontrarTop1(nomes, salarios, numFuncionarios);
        int posicaoTop2 = EncontrarTop2(nomes, salarios, numFuncionarios, posicaoTop1);
        int posicaoTop3 = EncontrarTop3(nomes, salarios, numFuncionarios, posicaoTop1, posicaoTop2);
        MostrarTops(nomes, salarios, posicaoTop1, posicaoTop2, posicaoTop3,numFuncionarios);
    }

    public static int LerEguardarNomes(String[] nomes, int[] salarios) {
        int numFuncionarios = 0;
        String funcionario;
        funcionario = ler.nextLine();
        while (!funcionario.equals("END")) {
            nomes[numFuncionarios] = funcionario;
            LerEguardarSalarios(salarios, numFuncionarios);
            numFuncionarios++;
            funcionario = ler.nextLine();
        }
        return numFuncionarios;
    }

    public static void LerEguardarSalarios(int[] salarios, int numFuncionarios) {
        salarios[numFuncionarios] = ler.nextInt();
        ler.nextLine();
    }

    public static int EncontrarTop1(String[] nomes, int[] salarios, int numFuncionarios) {
        int posicaoTop1 = 0, salarioTop1 = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            if (salarioTop1 < salarios[i]) {
                salarioTop1 = salarios[i];
                posicaoTop1 = i;
            }
            if (salarios[i] == salarioTop1 && nomes[posicaoTop1].compareTo(nomes[i]) > 0) { // Nomes desordenados alfabeticamente
                salarioTop1 = salarios[i];
                posicaoTop1 = i;
            }
        }
        return posicaoTop1;
    }

    public static int EncontrarTop2(String[] nomes, int[] salarios, int numFuncionarios, int posicaoTop1) {
        int posicaoTop2 = 0, salarioTop2 = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            if (salarioTop2 < salarios[i] && i != posicaoTop1) {
                salarioTop2 = salarios[i];
                posicaoTop2 = i;
            }
            if (salarios[i] == salarioTop2 && i != posicaoTop1) {
                if(nomes[posicaoTop2].compareTo(nomes[i]) > 0) { // Nomes desordenados alfabeticamente
                    salarioTop2 = salarios[i];
                    posicaoTop2 = i;
                }
            }
        }
        return posicaoTop2;
    }

    public static int EncontrarTop3(String[] nomes, int[] salarios, int numFuncionarios, int posicaoTop1, int posicaoTop2) {
        int posicaoTop3 = 0, salarioTop3 = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            if (salarioTop3 < salarios[i] && i != posicaoTop1 && i != posicaoTop2) {
                salarioTop3 = salarios[i];
                posicaoTop3 = i;
            }
            if (salarios[i] == salarioTop3 && i != posicaoTop1 && i != posicaoTop2 ) {
                if(nomes[posicaoTop3].compareTo(nomes[i]) > 0) {// Nomes desordenados alfabeticamente
                    salarioTop3 = salarios[i];
                    posicaoTop3 = i;
                }
            }
        }
        return posicaoTop3;
    }

    public static void MostrarTops(String[] nomes, int[] salarios, int posicaoTop1, int posicaoTop2, int posicaoTop3, int numFuncionarios) {
        if (numFuncionarios == 1) {
            System.out.println("#1 : " + nomes[posicaoTop1] + " : " + salarios[posicaoTop1]);
        } else if (numFuncionarios == 2) {
            System.out.println("#1 : " + nomes[posicaoTop1] + " : " + salarios[posicaoTop1]);
            System.out.println("#2 : " + nomes[posicaoTop2] + " : " + salarios[posicaoTop2]);
        } else if (numFuncionarios >= 3) {
            System.out.println("#1 : " + nomes[posicaoTop1] + " : " + salarios[posicaoTop1]);
            System.out.println("#2 : " + nomes[posicaoTop2] + " : " + salarios[posicaoTop2]);
            System.out.println("#3 : " + nomes[posicaoTop3] + " : " + salarios[posicaoTop3]);
        }
    }
}