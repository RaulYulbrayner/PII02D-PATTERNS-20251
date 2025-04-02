package co.edu.uniquindio.poo;

public class DibujoRojo implements DibujoImplementacion {
    @Override
    public void dibujarFigura(String figura) {
        System.out.println("Dibujando " + figura + " en color rojo.");
    }
}
