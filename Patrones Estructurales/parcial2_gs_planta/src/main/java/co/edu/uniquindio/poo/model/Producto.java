package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Producto modela un producto personalizable usando el patrón Builder.
 */
public class Producto {
    private String nombre;
    private List<String> componentes;
    private double precio;

    /**
     * Constructor privado utilizado por el Builder.
     */
    private Producto(Builder builder) {
        this.nombre = builder.nombre;
        this.componentes = builder.componentes;
        this.precio = builder.precio;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getComponentes() {
        return componentes;
    }

    public double getPrecio() {
        return precio;
    }

    /**
     * Verifica si el producto contiene cierto componente.
     * @param componente nombre del componente
     * @return true si lo contiene, false si no
     */
    public boolean contiene(String componente) {
        return componentes.contains(componente.toLowerCase());
    }

    public String toString() {
        return nombre + " - $" + precio + " - Componentes: " + componentes;
    }

    /**
     * Builder para la creación flexible de productos.
     */
    public static class Builder {
        private String nombre;
        private List<String> componentes = new ArrayList<>();
        private double precio;

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder addComponente(String nombre) {
            componentes.add(nombre.toLowerCase());
            return this;
        }

        public Builder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public Producto build() {
            return new Producto(this);
        }
    }
}