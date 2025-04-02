package co.edu.uniquindio.poo;

public class Opcion extends MenuComponent {

    private String nombre;

    public Opcion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar(int indent) {
        System.out.println("  ".repeat(indent) + "Opción: " + nombre);
    }

}
