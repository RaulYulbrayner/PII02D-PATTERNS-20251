package co.edu.uniquindio.poo.opcion2;

import co.edu.uniquindio.poo.opcion1.Computador;

public class ComputadorBuilder {

    private String procesador;
    private int ram;
    private String almacenamiento;
    private String tarjetaGrafica;
    private String sistemaOperativo;

    public Computador2 build(){
        return new Computador2(procesador, ram, almacenamiento, tarjetaGrafica, sistemaOperativo);
    }

    public ComputadorBuilder procesador(String procesador){
        this.procesador = procesador;
        return this;
    }

    public ComputadorBuilder ram(int ram){
        this.ram = ram;
        return this;
    }

    public ComputadorBuilder almacenamiento(String almacenamiento){
        this.almacenamiento = almacenamiento;
        return this;
    }

    public ComputadorBuilder tarjetaGrafica(String tarjetaGrafica){
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }

    public ComputadorBuilder sistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
        return this;
    }

}
