package co.edu.uniquindio.poo.punto3;

public class Habitacion {

    private int codHabitacion;

    public Habitacion(int codHabitacion) {
        this.codHabitacion = codHabitacion;
    }

    public int getCodHabitacion() {
        return codHabitacion;
    }

    public void setCodHabitacion(int codHabitacion) {
        this.codHabitacion = codHabitacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "codHabitacion=" + codHabitacion +
                '}';
    }
}
