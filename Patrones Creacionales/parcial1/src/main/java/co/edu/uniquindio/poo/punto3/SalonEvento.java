package co.edu.uniquindio.poo.punto3;

import java.io.Serializable;

// Punto 3.1 - B
// Implementar el patrón Builder para el objeto SalonEvento
public class SalonEvento implements ISalonEvento {

    private String nombre;
    private int capacidad;
    private boolean tieneProyector;
    private int IdSalon;

    private SalonEvento(SalonBuilder builder) {
        this.nombre = builder.nombre;
        this.capacidad = builder.capacidad;
        this.tieneProyector = builder.tieneProyector;
        this.IdSalon = builder.IdSalon;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isTieneProyector() {
        return tieneProyector;
    }

    public int getIdSalon() {
        return IdSalon;
    }

    @Override
    public void crearSalonEvento(String nombre, int capacidad, boolean tieneProyector, int IdSalon) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tieneProyector = tieneProyector;
        this.IdSalon = IdSalon;
    }

    @Override
    public void eliminarSalonEvento(int idSalon) {
        Hotel.getInstancia().eliminarSalonEvento(idSalon);
    }

    public static class SalonBuilder {
        private String nombre;
        private int capacidad;
        private boolean tieneProyector;
        private int IdSalon;

        public SalonBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public SalonBuilder setCapacidad(int capacidad) {
            this.capacidad = capacidad;
            return this;
        }

        public SalonBuilder setTieneProyector(boolean tieneProyector) {
            this.tieneProyector = tieneProyector;
            return this;
        }

        public SalonBuilder setIdSalon(int IdSalon) {
            this.IdSalon = IdSalon;
            return this;
        }

        public SalonEvento build() {
            return new SalonEvento(this);
        }
    }
}
