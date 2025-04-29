package co.edu.uniquindio.poo.model;

/**
 * Implementación básica de dispositivo de seguridad.
 */
public class DispositivoSimple implements Dispositivo {

    private String nombre;
    private boolean activo;
    private int prioridad;

    public DispositivoSimple(String nombre, boolean activo, int prioridad) {
        this.nombre = nombre;
        this.activo = activo;
        this.prioridad = prioridad;
    }

    @Override
    public String estado() {
        return "[" + nombre + "] Estado: " + (activo ? "Activo" : "Inactivo");
    }

    @Override
    public int prioridad() {
        return prioridad;
    }

    @Override
    public String tipo() {
        return nombre;
    }
    
}
