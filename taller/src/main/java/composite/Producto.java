package composite;

import java.util.List;

public class Producto {
    protected int id;
    protected String nombre;
    protected String marca;
    protected String modelo;
    protected double peso;
    protected double precio;
    protected List<Caracteristica> caracteristicas;

    public void addCaracteristica(Caracteristica caracteristica) {
        caracteristicas.add(caracteristica);
    }
}
