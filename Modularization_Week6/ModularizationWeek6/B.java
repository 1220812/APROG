import java.util.Scanner;
public class B {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int numeroAlunos, numeroDisciplinas, numeroAlunosAprovados;
        String nomeDisciplina;
        numeroAlunos= ler.nextInt();
        numeroDisciplinas=ler.nextInt();
        for (int disciplina = 0; disciplina < numeroDisciplinas; disciplina++) {
            nomeDisciplina= ler.next();
            numeroAlunosAprovados= ler.nextInt();
            imprimirInfo(nomeDisciplina,numeroAlunosAprovados,numeroAlunos);
        }
    }
    public static void imprimirInfo(String nomeDisciplina, int numeroAlunosAprovados, int numeroAlunos){
        System.out.println("Subject: "+nomeDisciplina);
        System.out.print("- Approved: ");
        for (int aprovado = 0; aprovado <numeroAlunosAprovados ; aprovado++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("- Failed: ");
        for (int reprovado = 0; reprovado <numeroAlunos-numeroAlunosAprovados ; reprovado++) {
            System.out.print("*");
        }
        System.out.println();
    }
}