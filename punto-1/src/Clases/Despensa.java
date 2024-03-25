package Clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Despensa {

    private List<Ingrediente> ingredientes;

    public Despensa() {
        this.ingredientes = new ArrayList<>();
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void getIngrediente(String nombre, int cantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equalsIgnoreCase(nombre)) {
                ingrediente.sacar(cantidad);
            }
        }
    }

    @Override
    public String toString() {
        return "Despensa{" +
                "ingredientes=" + ingredientes +
                '}';
    }
}
