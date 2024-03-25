import Clases.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Ingrediente huevo = new Ingrediente("Huevo", 10);
        Ingrediente leche = new Ingrediente("Leche", 10);
        Ingrediente azucar = new Ingrediente("Azucar", 10);
        Ingrediente maiz = new Ingrediente("Maiz", 10);
        Ingrediente aceite = new Ingrediente("Aceite", 10);
        Ingrediente agua = new Ingrediente("Agua", 10);
        Ingrediente esenciaDeVainilla = new Ingrediente("Esencia de vainilla", 10);
        Ingrediente sal = new Ingrediente("sal", 10);

        Receta huevoDuro = new HuevoDuro();
        huevoDuro.setTiempoCoccion(10);
        huevoDuro.setIngredientes(Arrays.asList(huevo, agua, sal));
        huevoDuro.setPreparacion("Hervir el huevo en agua con sal por 10 minutos, luego pelar, servir y agragarle sal.");

        Receta pochoclos = new Pochoclos();
        pochoclos.setTiempoCoccion(15);
        pochoclos.setIngredientes(Arrays.asList(maiz, aceite, azucar, esenciaDeVainilla));
        pochoclos.setPreparacion("Calentar el aceite en una olla, agregar el maiz, el azucar y esencia de vainilla, tapar y esperar a que se hagan los pochoclos, luego servir.");

        Receta flan = new Flan();
        flan.setTiempoCoccion(30);
        flan.setIngredientes(Arrays.asList(leche, azucar, huevo, esenciaDeVainilla));
        flan.setPreparacion("Mezclar la leche con el azucar y la esencia de vainilla, luego agregar los huevos y mezclar bien, poner en un molde caramelo y la preparacion luego cocinar a baño maria por 30 minutos, luego dejar enfriar y servir.");

        System.out.println(huevoDuro);
        System.out.println(pochoclos);
        System.out.println(flan);

    }
}
