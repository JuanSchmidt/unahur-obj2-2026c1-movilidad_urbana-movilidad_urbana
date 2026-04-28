package ar.edu.unahur.obj2.uml;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SistemaTest {

    @Test
    public void testAlquilerCambiaDisponibilidad() {

        Sistema sistema = new Sistema();
        Usuario u = new Usuario("Juan");
        Vehiculo v = new Bicicleta(29);

        sistema.agregarUsuario(u);
        sistema.agregarVehiculo(v);

        sistema.alquilar(u, v);

        assertFalse(v.estaDisponible());
    }

    @Test
    public void testDevolverVehiculo() {

        Sistema sistema = new Sistema();
        Usuario u = new Usuario("Juan");
        Vehiculo v = new Bicicleta(29);

        sistema.agregarUsuario(u);
        sistema.agregarVehiculo(v);

        Alquiler a = sistema.alquilar(u, v);
        a.finalizar();

        assertTrue(v.estaDisponible());
    }
}