package co.edu.uniquindio.poo.opcion1;

public class Computador {

    private String procesador;
    private int ram;
    private String almacenamiento;
    private String tarjetaGrafica;
    private String sistemaOperativo;

    public Computador(Builder builder){
        this.procesador = builder.procesador;
        this.ram = builder.ram;
        this.almacenamiento = builder.almacenamiento;
        this.tarjetaGrafica = builder.tarjetaGrafica;
        this.sistemaOperativo = builder.sistemaOperativo;
    }

    public void mostrarInfo(){
        System.out.println("Procesador: " + procesador);
        System.out.println("ram: " + ram);
        System.out.println("almacenamiento: " + almacenamiento);
        System.out.println("tarjetaGrafica: " + tarjetaGrafica);
        System.out.println("sistemaOperativo: " + sistemaOperativo);
    }

    //Clase interna builder
    public static class Builder{
        private String procesador;
        private int ram;
        private String almacenamiento;
        private String tarjetaGrafica;
        private String sistemaOperativo;

        public Computador build(){
            return new Computador(this);
        }

        public Builder procesador(String procesador){
            this.procesador = procesador;
            return this;
        }

        public Builder ram(int ram){
            this.ram = ram;
            return this;
        }

        public Builder almacenamiento(String almacenamiento){
            this.almacenamiento = almacenamiento;
            return this;
        }

        public Builder tarjetaGrafica(String tarjetaGrafica){
            this.tarjetaGrafica = tarjetaGrafica;
            return this;
        }

        public Builder sistemaOperativo(String sistemaOperativo){
            this.sistemaOperativo = sistemaOperativo;
            return this;
        }
    }

}
