package co.edu.uniquindio.poo;

public class Examen extends Plataforma {
    /**
     * Implementación del método abstracto enviarNotificacion.
     * Envía una notificación
     */
    @Override
    public void enviarNotificacion() {
        notificador.notificar("Muchachos todos 5");
    }
}
