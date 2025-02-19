package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Plataforma nota = new Nota();
        Plataforma evento = new Evento();
        Plataforma examen = new Examen();

        nota.enviarNotificacion();
        evento.enviarNotificacion();
        examen.enviarNotificacion();

        System.out.println(nota.notificador == examen.notificador);
        System.out.println(evento.notificador == examen.notificador);


    }
}