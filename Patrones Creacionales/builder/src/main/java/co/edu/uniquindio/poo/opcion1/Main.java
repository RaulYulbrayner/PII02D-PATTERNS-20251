package co.edu.uniquindio.poo.opcion1;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        Computador escritorio = director.construirComputadorEscritorio();
        Computador oficina = director.construirComputadorOficina();

        System.out.println("-------------------");
        escritorio.mostrarInfo();

        System.out.println("-------------------");
        oficina.mostrarInfo();

    }
}
