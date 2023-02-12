import java.util.Scanner;
public class J {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int N, numero,numeroCopia, digito;
        double percentagem, maiorPercentagem=0,quantidadeDigitos=0, quantidadeDivisores=0;
        N= ler.nextInt();
        if(N>0){
            for (int numerosInseridos = 0; numerosInseridos < N; numerosInseridos++) {
                numero= ler.nextInt();
                numeroCopia=numero;
                while (numero>0){
                    digito=numero%10;
                    quantidadeDigitos++;
                    numero=numero/10;
                    if(digito!=0) {
                        if (numeroCopia % digito == 0) {
                            quantidadeDivisores++;
                        }
                    }
                }
                percentagem = quantidadeDivisores*100 /quantidadeDigitos;
                if(quantidadeDivisores!=0) {
                    System.out.printf("%.2f%%\n",percentagem);
                }else{
                    System.out.println("0.00%");
                }
                if(percentagem>maiorPercentagem){
                    maiorPercentagem=percentagem;
                }
                quantidadeDigitos=0;
                quantidadeDivisores=0;
            }
            System.out.printf("(%.2f%%)\n", maiorPercentagem);
        }
    }
}