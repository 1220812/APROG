import java.util.Scanner;
public class L {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        String frase, fraseSemEspacos;
        frase= ler.nextLine();
        fraseSemEspacos=frase.trim(); // retirar os espaços em branco no ínicio e no fim da frase
        System.out.println(contarPalavras(fraseSemEspacos));
    }
    public static int contarPalavras(String frase) {
        int contador = 0;
        boolean espacoBranco = false;
        if(frase.length()>0){
            contador=1;
        }
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ' && !espacoBranco) { // caso entre duas palavras haja mais que 1 espaço em branco, só irá ser contada uma palavra
                espacoBranco = true;
                contador++;
            } else if (frase.charAt(i)!=' ') {
                espacoBranco=false;
            }
        }
        return contador;
    }
}