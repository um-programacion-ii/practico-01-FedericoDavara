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
    }
}
