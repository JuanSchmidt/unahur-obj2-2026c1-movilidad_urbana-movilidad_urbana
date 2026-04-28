package ar.edu.unahur.obj2.uml;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {

    private List<Usuario> usuarios = new ArrayList<>();
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private List<Alquiler> alquileres = new ArrayList<>();

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }
public Alquiler alquilar(Usuario usuario, Vehiculo vehiculo) {

    if (!vehiculo.estaDisponible()) {
        throw new RuntimeException("Vehículo no disponible");
    }

    vehiculo.alquilar();

    Alquiler alquiler = new Alquiler(usuario, vehiculo);

    alquileres.add(alquiler);
    usuario.agregarAlquiler(alquiler);

    return alquiler;
}

    public List<Vehiculo> vehiculosDisponibles() {
        return vehiculos.stream()
                .filter(Vehiculo::estaDisponible)
                .collect(Collectors.toList());
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }
}