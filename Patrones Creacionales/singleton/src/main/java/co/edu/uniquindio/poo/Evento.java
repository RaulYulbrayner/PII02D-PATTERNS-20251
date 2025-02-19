package co.edu.uniquindio.poo;

public class Evento extends Plataforma {
    @Override
    public void enviarNotificacion() {
        notificador.notificar("El evento se realizara en la fecha 19-02-2025");
    }
}
