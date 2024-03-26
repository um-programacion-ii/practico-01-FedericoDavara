package Clases;

import java.util.ArrayList;
import java.util.List;

public class Despensa {

    private List<Ingrediente> ingredientes;

    public Despensa() {
        this.ingredientes = new ArrayList<>();
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void sacarIngrediente(String nombre, int cantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equalsIgnoreCase(nombre)) {
                ingrediente.sacar(cantidad);
            }
        }
    }

    public Ingrediente buscarIngrediente(String nombre) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equalsIgnoreCase(nombre)) {
                return ingrediente;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Despensa{" +
                "ingredientes=" + ingredientes +
                '}';
    }
}
