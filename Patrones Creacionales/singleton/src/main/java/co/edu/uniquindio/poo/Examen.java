package co.edu.uniquindio.poo;

public class Examen extends Plataforma {
    @Override
    public void enviarNotificacion() {
        notificador.notificar("Muchachos todos 5");
    }
}
