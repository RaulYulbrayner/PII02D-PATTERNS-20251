package co.edu.uniquindio.poo;

public abstract class Plataforma {

    protected Notificador notificador;

    public Plataforma() {
        this.notificador = Notificador.getInstancia();
    }

    public abstract void enviarNotificacion();

}
