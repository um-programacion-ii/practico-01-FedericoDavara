import Clases.*;

import java.util.Arrays;
import java.util.List;

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

        Ingrediente huevoReceta = new Ingrediente("Huevo", 4);
        Ingrediente lecheReceta = new Ingrediente("Leche", 4);
        Ingrediente azucarReceta = new Ingrediente("Azucar", 3);
        Ingrediente maizReceta = new Ingrediente("Maiz", 4);
        Ingrediente aceiteReceta = new Ingrediente("Aceite", 8);
        Ingrediente aguaReceta = new Ingrediente("Agua", 7);
        Ingrediente esenciaDeVainillaReceta = new Ingrediente("Esencia de vainilla", 6);
        Ingrediente salReceta = new Ingrediente("sal", 5);

        Receta huevoDuro = new HuevoDuro();
        huevoDuro.setNombre("HuevoDuro");
        huevoDuro.setTiempoCoccion(10);
        huevoDuro.setIngredientes(Arrays.asList(huevoReceta, aguaReceta, salReceta));
        huevoDuro.setPreparacion("Hervir el huevo en agua con sal por 10 minutos, luego pelar, servir y agragarle sal.");

        Receta pochoclos = new Pochoclos();
        pochoclos.setNombre("Pochoclos");
        pochoclos.setTiempoCoccion(15);
        pochoclos.setIngredientes(Arrays.asList(maizReceta, aceiteReceta, azucarReceta, esenciaDeVainillaReceta));
        pochoclos.setPreparacion("Calentar el aceite en una olla, agregar el maiz, el azucar y esencia de vainilla, tapar y esperar a que se hagan los pochoclos, luego servir.");

        Receta flan = new Flan();
        flan.setNombre("Flan");
        flan.setTiempoCoccion(30);
        flan.setIngredientes(Arrays.asList(lecheReceta, azucarReceta, huevoReceta, esenciaDeVainillaReceta));
        flan.setPreparacion("Mezclar la leche con el azucar y la esencia de vainilla, luego agregar los huevos y mezclar bien, poner en un molde caramelo y la preparacion luego cocinar a baño maria por 30 minutos, luego dejar enfriar y servir.");

        List<Ingrediente> ingredientes = Arrays.asList(huevo, leche, azucar, maiz, aceite, agua, esenciaDeVainilla, sal);
        Despensa despensa = new Despensa();
        despensa.setIngredientes(ingredientes);
        Chef chef = new Chef();
        CocinaService cocinaService = new CocinaService();
        cocinaService.setDespensa(despensa);
        cocinaService.setRecetas(Arrays.asList(huevoDuro, pochoclos, flan));
        chef.setNombre("Xavier");
        chef.setCocinaService(cocinaService);
        chef.getCocinaService().crearReceta("HuevoDuro");
        chef.getCocinaService().crearReceta("Pochoclos");
        chef.getCocinaService().crearReceta("Flan");


    }
}
