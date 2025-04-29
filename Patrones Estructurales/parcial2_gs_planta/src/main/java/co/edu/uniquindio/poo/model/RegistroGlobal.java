package co.edu.uniquindio.poo.model;

import java.util.*;

/**
 * Singleton que gestiona un registro global de productos.
 */
public class RegistroGlobal {
    private static RegistroGlobal instancia;
    private List<Producto> productos = new ArrayList<>();

    private RegistroGlobal() {
    }

    public static RegistroGlobal getInstancia() {
        if (instancia == null)
            instancia = new RegistroGlobal();
        return instancia;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void mostrar() {
        System.out.println("\nProductos en Registro Global:");
        productos.forEach(System.out::println);
    }
}
