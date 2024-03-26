package Clases;

public class Chef {
    private String nombre;
    private int estrellasMichelin;
    private  CocinaService cocinaService;

    public Chef() {
    }

    public Chef(String nombre, int estrellasMichelin) {
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellasMichelin() {
        return estrellasMichelin;
    }

    public void setEstrellasMichelin(int estrellasMichelin) {
        this.estrellasMichelin = estrellasMichelin;
    }

    public CocinaService getCocinaService() {
        return cocinaService;
    }

    public void setCocinaService(CocinaService cocinaService) {
        this.cocinaService = cocinaService;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "chef='" + nombre + '\'' +
                ", estrellasMichelin=" + estrellasMichelin +
                '}';
    }
}
