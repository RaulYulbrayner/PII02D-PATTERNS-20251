package co.edu.uniquindio.poo.opcion2;

import co.edu.uniquindio.poo.opcion1.Computador;

public class Computador2 {

    private String procesador;
    private int ram;
    private String almacenamiento;
    private String tarjetaGrafica;
    private String sistemaOperativo;

    public Computador2(String procesador, int ram, String almacenamiento, String tarjetaGrafica, String sistemaOperativo) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjetaGrafica = tarjetaGrafica;
        this.sistemaOperativo = sistemaOperativo;
    }

    public void mostrarInfo(){
        System.out.println("Procesador: " + procesador);
        System.out.println("ram: " + ram);
        System.out.println("almacenamiento: " + almacenamiento);
        System.out.println("tarjetaGrafica: " + tarjetaGrafica);
        System.out.println("sistemaOperativo: " + sistemaOperativo);
    }

}
