package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Figura circuloRojo = new Circulo(new DibujoRojo());
        Figura cuadradoAzul = new Cuadrado(new DibujoAzul());

        circuloRojo.dibujar();
        cuadradoAzul.dibujar();
    }
}