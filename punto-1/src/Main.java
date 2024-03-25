import Clases.Despensa;
import Clases.Ingrediente;

public class Main {
    public static void main(String[] args) {
        // Crear un ingrediente
        Ingrediente ingrediente = new Ingrediente("Mayonesa", 34);
        System.out.println(ingrediente);

        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("Mostaza");
        ingrediente1.setCantidad(40);
        System.out.println(ingrediente1);

        Despensa despensa = new Despensa();
        despensa.addIngrediente(ingrediente);
        despensa.addIngrediente(ingrediente1);
        despensa.getIngrediente("Mayonesa", 10);
        despensa.getIngrediente("Mostaza", 50);
        System.out.println(despensa);
    }

}
