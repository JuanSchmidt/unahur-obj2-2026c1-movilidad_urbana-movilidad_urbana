package ar.edu.unahur.obj2.uml;

import java.time.LocalDate;

public class Alquiler {

   private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Usuario usuario;
    private Vehiculo vehiculo;

   public Alquiler(Usuario usuario, Vehiculo vehiculo) {
    this.usuario = usuario;
    this.vehiculo = vehiculo;
    this.fechaInicio = LocalDate.now();
}

    public void finalizar() {
        this.fechaFin = LocalDate.now();
        vehiculo.devolver();
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    

    
}
