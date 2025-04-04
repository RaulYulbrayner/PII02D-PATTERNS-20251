package co.edu.uniquindio.poo.reserva;

public class Reserva {
    private String nombreCliente;
    private String tipoHabitacion;
    private String fecha;
    private double precio;

    public Reserva(String nombreCliente, String tipoHabitacion, String fecha, double precio) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.fecha = fecha;
        this.precio = precio;
    }

    // Getters
    public String getNombreCliente() { return nombreCliente; }
    public String getTipoHabitacion() { return tipoHabitacion; }
    public String getFecha() { return fecha; }
    public double getPrecio() { return precio; }
}
