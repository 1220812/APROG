import java.util.Scanner;
public class M {
    static Scanner ler=new Scanner(System.in);
    public static void main(String[]args){
        int[] numeros=new int[50];
        int numerosLidos=LerEguardarNumeros(numeros);
        for (int i = 0; i < numerosLidos; i++) {
            System.out.println(numeros[i]+" : "+ContarAlgarismosDiferentes(numeros,i));
        }
    }
    public static int LerEguardarNumeros (int[] numeros){
        int numerosLidos=0, numero;
        numero= ler.nextInt();
        while (numero>=0){
            numeros[numerosLidos]=numero;
            numerosLidos++;
            numero=ler.nextInt();
        }
        return numerosLidos;
    }
    public static boolean VerificarSeNumeroRepetido (int numero, int digito){
        int digito1;
        boolean repetido=false;
        do{
            digito1=numero%10;
            numero=numero/10;
            if(digito==digito1){
                repetido=true;
            }
        }while (numero!=0);
        return repetido;
    }
    public static int ContarAlgarismosDiferentes (int[] numeros, int posicao){
        int numero=numeros[posicao];
        int digito1, contadorAlgarismosDiferentes=0;
        boolean repetido;
        while (numero!=0){
            digito1=numero%10;
            numero=numero/10;
            contadorAlgarismosDiferentes++; // Contar todos os digitos do número
            repetido=VerificarSeNumeroRepetido(numero,digito1); // Verificar digito a digito se há digitos repetidos
            if(repetido){
                contadorAlgarismosDiferentes--; // Subtraí-se a quantidade de digitos que são iguais
            }
        }
        if(numeros[posicao]==0){
            contadorAlgarismosDiferentes=1; // Se os digitos do número forem todos iguais, existe apenas um digito diferente
        }
        return contadorAlgarismosDiferentes;
    }
}