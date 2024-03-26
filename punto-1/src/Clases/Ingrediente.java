package Clases;

public class Ingrediente {
    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public Ingrediente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void sacar(int cantidad) {

        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se sacaron " + cantidad + " de " + this.nombre + " de la despensa.");
        }else{
            System.out.println("No hay suficiente cantidad de " + this.nombre + " para sacar.");
        }
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
