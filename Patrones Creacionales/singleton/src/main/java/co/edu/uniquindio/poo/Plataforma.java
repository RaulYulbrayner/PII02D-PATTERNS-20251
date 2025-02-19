package co.edu.uniquindio.poo;

public abstract class Plataforma {

    /**
     * Instancia del Notificador utilizada por la plataforma
     */
    protected Notificador notificador;

    /**
     * Constructor que inicializa la plataforma obteniendo la instancia del Notificador
     */
    public Plataforma() {
        this.notificador = Notificador.getInstancia();
    }

    /**
     * Método abstracto que debe ser implementado por las clases hijas para enviar una notificación
     */
    public abstract void enviarNotificacion();

}
