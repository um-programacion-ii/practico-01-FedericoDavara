package Clases;

import java.util.List;

public class Receta {
    private double tiempoCoccion;
    private List<Ingrediente> ingredientes;
    private String preparacion;

    public Receta() {
    }

    public double getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(double tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "tiempoCoccion=" + tiempoCoccion +
                ", ingredientes=" + ingredientes +
                ", preparacion='" + preparacion + '\'' +
                '}';
    }
}
