package co.edu.uniquindio.poo;

public class Nota extends Plataforma {
    @Override
    public void enviarNotificacion() {
        notificador.notificar("Nota enviada");
    }
}
