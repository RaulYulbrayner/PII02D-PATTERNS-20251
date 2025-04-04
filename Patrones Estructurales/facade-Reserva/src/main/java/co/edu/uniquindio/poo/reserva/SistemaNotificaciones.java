package co.edu.uniquindio.poo.reserva;

public class SistemaNotificaciones {
    public void enviarConfirmacion(String nombre, String tipo, String fecha) {
        System.out.println("Email enviado a " + nombre + ":");
        System.out.println("Confirmación de reserva - Habitación " + tipo + " para el " + fecha);
    }

    public void enviarCancelacion(String nombre) {
        System.out.println("Email enviado a " + nombre + ":");
        System.out.println("Su reserva ha sido cancelada");
    }
}