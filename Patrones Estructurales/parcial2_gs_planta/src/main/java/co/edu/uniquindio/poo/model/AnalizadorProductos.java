package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase utilitaria para analizar productos en el registro.
 */
public class AnalizadorProductos {
    
     /**
     * Filtra productos que contienen un componente específico.
     * @param componente nombre del componente
     * @return lista de productos filtrados
     */
    public static List<Producto> filtrarPorComponente(String componente) {
        List<Producto> resultado = new ArrayList<>();
        RegistroGlobal registro = RegistroGlobal.getInstancia();
        List<Producto> productos = registro.getProductos();

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            if (p.contiene(componente)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    /**
     * Ordena productos por precio ascendente.
     * @return lista de productos ordenados
     */
    public static List<Producto> ordenarPorPrecio() {
        List<Producto> productos = new ArrayList<>(RegistroGlobal.getInstancia().getProductos());
        for (int i = 0; i < productos.size() - 1; i++) {
            for (int j = 0; j < productos.size() - i - 1; j++) {
                if (productos.get(j).getPrecio() > productos.get(j + 1).getPrecio()) {
                    Producto temp = productos.get(j);
                    productos.set(j, productos.get(j + 1));
                    productos.set(j + 1, temp);
                }
            }
        }
        return productos;
    }

    /**
     * Cuenta cuántos productos hay por nombre.
     * @return mapa de nombre de producto a cantidad
     */
    public static void contarPorNombre() {
        List<Producto> productos = RegistroGlobal.getInstancia().getProductos();
        List<String> nombresContados = new ArrayList<>();

        for (int i = 0; i < productos.size(); i++) {
            String nombre = productos.get(i).getNombre();
            boolean yaContado = false;

            for (int j = 0; j < nombresContados.size(); j++) {
                if (nombresContados.get(j).equals(nombre)) {
                    yaContado = true;
                    break;
                }
            }
            if (!yaContado) {
                int contador = 1;
                for (int k = i + 1; k < productos.size(); k++) {
                    if (productos.get(k).getNombre().equals(nombre)) {
                        contador++;
                    }
                }
                nombresContados.add(nombre);
                System.out.println(nombre + ": " + contador);
            }
        }
    }

}
