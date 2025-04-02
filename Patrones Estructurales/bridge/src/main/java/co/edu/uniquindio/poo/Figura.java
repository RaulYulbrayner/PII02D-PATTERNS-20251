package co.edu.uniquindio.poo;

public abstract class Figura {

    protected DibujoImplementacion implementacion;

    public Figura(DibujoImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    public abstract void dibujar();

}
