package co.edu.uniquindio.poo.model;

//Strategy
public class EmailNotification implements NotificationStrategy {

    @Override
    public void send(User user, String message) {
        System.out.println("Email enviado a " + user.getEmail());
        System.out.println("Contenido:\n" + message);
    }

}
