package co.edu.uniquindio.poo.model;

//Strategy
public class PushNotification implements NotificationStrategy {

    @Override
    public void send(User user, String message) {
        System.out.println("🔔 Push enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + message);
    }

}
