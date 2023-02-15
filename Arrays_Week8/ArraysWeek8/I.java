import java.util.Scanner;
public class I {
    static Scanner ler=new Scanner(System.in);
    static final int NUMERO_ENTRADAS=3;
    static final int NUMERO_PISOS=4;
    public static void main(String[]args){
        String[][] nomesProprietarios=LerNomesProprietarios();
        MostrarEntradaEpisoDoProprietario(nomesProprietarios);
    }
    public static String[][] LerNomesProprietarios (){
        String[][] nomesProprietarios=new String[NUMERO_ENTRADAS][NUMERO_PISOS];
        for (int i = 0; i <NUMERO_ENTRADAS ; i++) {
            for (int j = 0; j <NUMERO_PISOS ; j++) {
                nomesProprietarios[i][j]= ler.nextLine();
            }
        }
        return nomesProprietarios;
    }
    public static void MostrarEntradaEpisoDoProprietario (String[][] nomesProprietarios){
        String proprietarioAprocurar= ler.nextLine();
        boolean encontrado=false;
        for (int i = 0; i <NUMERO_ENTRADAS ; i++) {
            for (int j = 0; j <NUMERO_PISOS ; j++) {
                if(proprietarioAprocurar.equals(nomesProprietarios[i][j])){
                    encontrado=true;
                    System.out.println("name="+proprietarioAprocurar);
                    System.out.println("entrance="+i);
                    System.out.println("floor="+j);
                }
            }
        }
        if(!encontrado){
            System.out.println("Do not live in the building");
        }
    }
}