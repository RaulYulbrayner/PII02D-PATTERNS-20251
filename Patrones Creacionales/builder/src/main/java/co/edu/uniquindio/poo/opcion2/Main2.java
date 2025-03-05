package co.edu.uniquindio.poo.opcion2;

public class Main2 {

    public static void main(String[] args) {

        Computador2 computador = new ComputadorBuilder()
                .procesador("Intel i1")
                .ram(1)
                .almacenamiento("62")
                .tarjetaGrafica("RTX1")
                .sistemaOperativo("XP")
                .build();

        computador.mostrarInfo();
    }

}
