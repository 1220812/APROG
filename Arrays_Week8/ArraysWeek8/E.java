import java.util.Scanner;
public class E {
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        String [] nomes=new String[21];
        double [] vencimentos=new double[21];
        int numElementos=LerNomesEvencimentos(nomes,vencimentos);
        System.out.printf("%.1f\n", CalcularMedia(vencimentos,numElementos));
        MostrarNomesComSalariosInferioresMedia(nomes,vencimentos,numElementos);
    }
    public static int LerNomesEvencimentos (String[] nomes, double[] vencimentos){
        int numElementos=0;
        String nome= ler.next();
        while (!nome.equalsIgnoreCase("end")){
            nomes[numElementos]=nome;
            vencimentos[numElementos]= ler.nextDouble();
            numElementos++;
            nome= ler.next();
        }
        return numElementos;
    }
    public static double CalcularMedia ( double[] vencimentos, int numElementos){
        double somaVencimentos=0;
        for (int i = 0; i < numElementos ; i++) {
            somaVencimentos=somaVencimentos+vencimentos[i];
        }
        return somaVencimentos/numElementos;
    }
    public static void MostrarNomesComSalariosInferioresMedia(String[] nomes, double[] vencimentos, int numElementos){
        double media=CalcularMedia(vencimentos,numElementos);
        for (int i = 0; i < numElementos ; i++) {
            if(vencimentos[i]<media){
                System.out.println(nomes[i]);
            }
        }
    }
}
