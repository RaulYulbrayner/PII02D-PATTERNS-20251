package co.edu.uniquindio.poo;

public class Nota extends Plataforma {
    /**
     * Implementación del método abstracto enviarNotificacion.
     * Envía una notificación
     */
    @Override
    public void enviarNotificacion() {
        notificador.notificar("Nota enviada");
    }
}
