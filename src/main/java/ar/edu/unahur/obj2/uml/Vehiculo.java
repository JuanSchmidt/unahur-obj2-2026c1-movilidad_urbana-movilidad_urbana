package ar.edu.unahur.obj2.uml;

public class Vehiculo {

    private boolean disponible = true;

    public boolean estaDisponible() {
        return disponible;
    }

    public void alquilar() {
        if (!disponible) {
            throw new RuntimeException("El vehículo no está disponible");
        }
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }
}
