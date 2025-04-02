package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private String nombre;
    private List<MenuComponent> componentes = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void add(MenuComponent component) {
        componentes.add(component);
    }

    public void remove(MenuComponent component) {
        componentes.remove(component);
    }

    @Override
    public void mostrar(int indent) {
        System.out.println("  ".repeat(indent) + "Menú: " + nombre);
        for (MenuComponent c : componentes) {
            c.mostrar(indent + 1);
        }
    }

}
