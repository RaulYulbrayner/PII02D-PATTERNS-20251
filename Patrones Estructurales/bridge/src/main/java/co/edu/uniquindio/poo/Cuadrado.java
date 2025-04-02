package co.edu.uniquindio.poo;

public class Cuadrado extends Figura {
    public Cuadrado(DibujoImplementacion implementacion) {
        super(implementacion);
    }

    public void dibujar() {
        implementacion.dibujarFigura("cuadrado");
    }
}
