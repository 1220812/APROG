import java.util.Scanner;
public class H{
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        int N= ler.nextInt();
        int[] sequencia=new int[N];
        sequencia=LerValoresSequencia(sequencia,N);
        String comando;
            do {
                comando= ler.next();
                if(comando.equals("right")){
                    rodarSequenciaDireita(sequencia,N);
                    MostrarSequenciaRodada(sequencia,N);
                }else if(comando.equals("left")){
                    rodarSequenciaEsquerda(sequencia,N);
                    MostrarSequenciaRodada(sequencia,N);
                }
            }while (!comando.equals("exit"));
        }
    public static int[] LerValoresSequencia (int[] sequencia, int N){
        for (int i = 0; i <N ; i++) {
            sequencia[i]= ler.nextInt();
        }
        return sequencia;
    }
    public static int[] rodarSequenciaDireita(int[] sequencia, int N){ // O último elemento do array passa a ser o primeiro
        int elementoUltimaPosicao=sequencia[N-1]; // Armazenar o valor do último elemento da sequência
        for (int i = N-2; i >= 0 ; i--) {
            sequencia[i+1]=sequencia[i]; // O valor armazenado numa determinada posição, passa a ser igual ao valor armazenado na posição anterior
            /*
            Exemplo: sequencia =[1][2][3][4] -> N=4, último digito=4
            Para i=2 (4-2):
              sequencia[3(i+1)]=sequencia[2(i)] -> sequencia[3]= 3 (anteriormente 4);
            Para i=1 (4-3):
              sequencia[2(i+1)]=sequencia[1(i)] -> sequencia[2]= 2 (anteriormente 3);
            Para i=0 (4-4):
              sequencia[1(i+1)]=sequencia[0(i)] -> sequencia[1]= 1 (anterioremnte 2);
            Sequencia[0]=4 (último digito)
            ___________________________________________________________________________________
            sequencia=[4][1][2][3]
             */
        }
        sequencia[0]=elementoUltimaPosicao; // O elemento na primeira posição do array passa a ser o que anteriormente estava na última
        return sequencia;
    }
    public static int[] rodarSequenciaEsquerda (int[] sequencia, int N){ // O primeiro elemento do array passa a ser o último
        int elementoPrimeiraPosicao=sequencia[0]; // Armazenar o valor do primeiro elemento da sequência
        for (int i = 0; i < N-1 ; i++) {
            sequencia[i]=sequencia[i+1]; // O valor armazenado numa determinada posição, passa a ser igual ao valor armazenado na posição seguinte
            /*
            Exemplo: sequencia =[1][2][3][4] -> N=4, primeiro digito=1
            Para i=0 :
              sequencia[0(i)]=sequencia[1(i+1)] -> sequencia[0]= 2 (anteriormente 1);
            Para i=1 :
              sequencia[1(i)]=sequencia[2(i+1)] -> sequencia[1]= 3 (anteriormente 2);
            Para i=2 :
              sequencia[2(i)]=sequencia[3(i+1)] -> sequencia[2]= 4 (anterioremnte 3);
            sequencia[N-1]=1 (primeiro digito)
            ____________________________________________________________________________________
            sequencia=[2][3][4][1]
             */
        }
        sequencia[N-1]=elementoPrimeiraPosicao; // O elemento na última posição do array passa a ser o que anteriormente estava na primeira
        return sequencia;
    }
    public static void MostrarSequenciaRodada (int[] sequencia, int N){
        String output="";
        for (int i = 0; i <N ; i++) {
            output=output+("["+sequencia[i]+"]");
        }
        System.out.println(output);
    }
}