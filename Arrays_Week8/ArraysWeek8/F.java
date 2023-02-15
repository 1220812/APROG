import java.util.Scanner;
public class F{
    static Scanner ler=new Scanner(System.in);
    static final int MESES_A_CONSIDERAR=6;
    public static void main (String[]args){
        double[] taxasMensais;
        taxasMensais =LerTaxasJuroMensais();
        double depositoInicial= LerValorDepositoInicial();
        System.out.printf("final value=%.2f\n", CalcularMontanteGerado(taxasMensais,depositoInicial));
    }
    public static double[] LerTaxasJuroMensais (){
        double[] taxasMensais=new double[MESES_A_CONSIDERAR];
        for (int i = 0; i <MESES_A_CONSIDERAR ; i++) {
            taxasMensais[i]= ler.nextDouble();
        }
        return taxasMensais;
    }
    public static double LerValorDepositoInicial(){
        return ler.nextDouble();
    }
    public static double CalcularMontanteGerado (double[] taxasMensais, double depositoInicial){
        double depositoFinal=depositoInicial;
        for (int i = 0; i <MESES_A_CONSIDERAR ; i++) {
            depositoFinal=depositoFinal+(depositoFinal*taxasMensais[i]);
        }
        return depositoFinal;
    }
}
