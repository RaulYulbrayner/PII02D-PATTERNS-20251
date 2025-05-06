package co.edu.uniquindio.poo.model;

public class SMSNotification implements NotificationStrategy{

    @Override
    public void send(User user, String message) {
        System.out.println("SMS enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + message);
    }

}
