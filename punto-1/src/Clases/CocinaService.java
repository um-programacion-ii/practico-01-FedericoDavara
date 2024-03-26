package Clases;

import java.util.List;

public class CocinaService {
    private Despensa despensa;
    private List<Receta> recetas;

    public CocinaService() {
    }

    public CocinaService(Despensa despensa, List<Receta> recetas) {
        this.despensa = despensa;
        this.recetas = recetas;
    }

    public Despensa getDespensa() {
        return despensa;
    }

    public void setDespensa(Despensa despensa) {
        this.despensa = despensa;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public void crearReceta(String nombre){
        System.out.println("Creando receta " + nombre);
        for (Receta receta : recetas){
            if (receta.getNombre().equalsIgnoreCase(nombre)){
                if (verificarIngredientes(receta)) {
                    System.out.println("Receta " + nombre + " creada con exito");
                }else {
                    System.out.println("No se pudo crear la receta " + nombre);
                }
            }
        }
    }

    public boolean verificarIngredientes(Receta receta){
        for (Ingrediente ingrediente : receta.getIngredientes()){
            Ingrediente ingredienteDespensa = despensa.buscarIngrediente(ingrediente.getNombre());
            if (ingredienteDespensa == null){
                System.out.println("No se puede preparar la receta, falta el ingrediente " + ingrediente.getNombre());
                return false;
            }else if (ingredienteDespensa.getCantidad() < ingrediente.getCantidad()){
                System.out.println("No se puede preparar la receta, no hay suficiente cantidad de " + ingrediente.getNombre() + " en la despensa hay " + ingredienteDespensa.getCantidad() + " y se necesitan " + ingrediente.getCantidad());
                return false;
            }else {
                despensa.sacarIngrediente(ingrediente.getNombre(), ingrediente.getCantidad());
            }
        }
        return true;
    }
}
