import java.util.Scanner;
public class C {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        double a, b , c;
        a= ler.nextDouble();
        b= ler.nextDouble();
        c= ler.nextDouble();
        if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a){
            System.out.printf("%.2f\n",a);
            System.out.printf("%.2f\n",b);
            System.out.printf("%.2f\n",c);
            System.out.printf("ang(a,b)=%.2f\n",angulo(a,b,c));
            System.out.printf("ang(a,c)=%.2f\n",angulo(a,c,b));
            System.out.printf("ang(b,c)=%.2f\n",angulo(b,c,a));
        }else{
            System.out.println("impossible");
        }
    }
    public static double angulo(double a, double b, double c){
        double angulo, anguloGraus;
        angulo=Math.acos(((Math.pow(a,2))+(Math.pow(b,2))-(Math.pow(c,2)))/(2*a*b));
        anguloGraus=Math.toDegrees(angulo);
        return anguloGraus;
    }
}