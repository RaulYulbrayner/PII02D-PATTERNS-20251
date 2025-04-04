package co.edu.uniquindio.poo.reserva;

public class SistemaPagos {
    public double calcularPrecio(String tipoHabitacion) {
        return tipoHabitacion.equals("INDIVIDUAL") ? 50.0 : 80.0;
    }
}