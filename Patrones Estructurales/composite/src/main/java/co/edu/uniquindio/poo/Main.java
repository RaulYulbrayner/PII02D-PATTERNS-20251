package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu principal = new Menu("Principal");
        Menu archivo = new Menu("Archivo");
        archivo.add(new Opcion("Nuevo"));
        archivo.add(new Opcion("Abrir"));

        Menu editar = new Menu("Editar");
        editar.add(new Opcion("Cortar"));
        editar.add(new Opcion("Pegar"));

        principal.add(archivo);
        principal.add(editar);
        principal.add(new Opcion("Ayuda"));

        principal.mostrar(0);
    }
}