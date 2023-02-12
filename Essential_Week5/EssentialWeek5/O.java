import java.util.Scanner;
public class O {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int ingredientesAevitar, copiaIngredientesAevitar, numeroPizzas, pizza,pizzaCopia, ingrediente, ingrPizza, sugestao=0;
        boolean alergico;
        ingredientesAevitar= ler.nextInt();
        copiaIngredientesAevitar=ingredientesAevitar;
        numeroPizzas= ler.nextInt();
        for (int i = 1; i <=numeroPizzas ; i++) {
            pizza= ler.nextInt();
            pizzaCopia=pizza;
            alergico=false;
            do {
                ingrPizza=pizza%10;
                pizza=pizza/10;
                ingredientesAevitar=copiaIngredientesAevitar;
                do {
                    ingrediente=ingredientesAevitar%10;
                    ingredientesAevitar=ingredientesAevitar/10;
                    if (ingrediente==ingrPizza){
                        alergico=true;
                    }
                } while (ingredientesAevitar!=0);
            }while (pizza!=0);
            if(!alergico){
                sugestao++;
                System.out.println("Suggestion #"+sugestao+":"+pizzaCopia);
            }
        }
    }
}