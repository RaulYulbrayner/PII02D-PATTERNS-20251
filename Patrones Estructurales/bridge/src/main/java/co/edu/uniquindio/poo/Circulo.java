package co.edu.uniquindio.poo;

public class Circulo extends Figura {
    public Circulo(DibujoImplementacion implementacion) {
        super(implementacion);
    }

    public void dibujar() {
        implementacion.dibujarFigura("círculo");
    }

}
