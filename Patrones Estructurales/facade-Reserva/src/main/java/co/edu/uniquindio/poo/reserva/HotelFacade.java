package co.edu.uniquindio.poo.reserva;

public class HotelFacade {
    private SistemaReservas sistemaReservas;
    private SistemaPagos sistemaPagos;
    private SistemaNotificaciones sistemaNotificaciones;

    public HotelFacade() {
        this.sistemaReservas = new SistemaReservas();
        this.sistemaPagos = new SistemaPagos();
        this.sistemaNotificaciones = new SistemaNotificaciones();
    }

    public void verHabitacionesDisponibles() {
        sistemaReservas.mostrarDisponibilidad();
    }

    public void reservar(String nombreCliente, String tipoHabitacion, String fecha) {
        if (sistemaReservas.verificarDisponibilidad(tipoHabitacion, fecha)) {
            double precio = sistemaPagos.calcularPrecio(tipoHabitacion);
            sistemaReservas.registrarReserva(nombreCliente, tipoHabitacion, fecha, precio);
            sistemaNotificaciones.enviarConfirmacion(nombreCliente, tipoHabitacion, fecha);
        } else {
            System.out.println("No hay habitaciones disponibles de ese tipo para esa fecha");
        }
    }

    public void cancelarReserva(String nombreCliente) {
        sistemaReservas.cancelarReserva(nombreCliente);
        sistemaNotificaciones.enviarCancelacion(nombreCliente);
    }
}