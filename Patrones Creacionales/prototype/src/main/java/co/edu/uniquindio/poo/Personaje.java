package co.edu.uniquindio.poo;

public class Personaje implements ClonablePersonaje {

    private String nombre;
    private int vida;
    private int fuerza;

    public Personaje(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    @Override
    public Personaje clone() {
        try {
            return (Personaje) super.clone();
        } catch (CloneNotSupportedException e) {
            throw  new RuntimeException("El personaje no puede ser Cloneable");
        }
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", fuerza=" + fuerza +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
