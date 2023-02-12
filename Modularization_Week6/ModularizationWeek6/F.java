import java.util.Scanner;
public class F {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        double R, Height;
        String solido= ler.next();
        while (!solido.equalsIgnoreCase("end")){
            if(solido.equalsIgnoreCase("sphere")){
                R= ler.nextDouble();
                System.out.printf("%.2f\n",sphere(R));
            } else if (solido.equalsIgnoreCase("cylinder")) {
                R= ler.nextDouble();
                Height= ler.nextDouble();
                System.out.printf("%.2f\n",cylinder(R,Height));
            } else if (solido.equalsIgnoreCase("cone")) {
                R=ler.nextDouble();
                Height= ler.nextDouble();
                System.out.printf("%.2f\n",cone(R,Height));
            }
            solido= ler.next();
        }
    }
    public static float sphere (double R){
        float volume;
        volume= (float) ((4*Math.pow(R,3)*Math.PI)/3);
        return volume;
    }
    public static float cylinder (double R, double Height){
        float volume;
        volume= (float) (Math.PI*Math.pow(R,2)*Height);
        return volume;
    }
    public static float cone(double R, double Height){
        float volume;
        volume= (float) ((Math.PI*Math.pow(R,2)*Height)/3);
        return volume;
    }
}