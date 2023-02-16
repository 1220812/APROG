import java.util.Scanner;
public class Q {
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        int E, F;
        String valores= ler.nextLine();
        String[] entradasEpisos=valores.split(" ");
        E=Integer.parseInt(entradasEpisos[0]);
        F=Integer.parseInt(entradasEpisos[1]);
        String[][] dados=new String[E][F];
        dados=LerProprietarios(dados,E,F);
        MostrarEntradaEpisoNomeEscolhido(dados,E,F);
    }
    public static String[][] LerProprietarios (String[][]dados, int E, int F){
        for (int i = 0; i <E ; i++) {
            for (int j = 0; j <F ; j++) {
                    dados[i][j]= ler.nextLine();
                }
            }
        return dados;
    }
    public static void MostrarEntradaEpisoNomeEscolhido (String[][] dados, int E, int F){
        String proprietario= ler.nextLine();
        boolean encontrado=false;
        for (int i = 0; i <E ; i++) {
            for (int j = 0; j <F ; j++) {
                if(dados[i][j].equals(proprietario)){
                    encontrado=true;
                    System.out.println("name="+proprietario);
                    System.out.println("entrance="+i);
                    System.out.println("floor="+j);
                }
            }
        }
        if (!encontrado){
            System.out.println("Do not live in the building");
        }
    }
}
