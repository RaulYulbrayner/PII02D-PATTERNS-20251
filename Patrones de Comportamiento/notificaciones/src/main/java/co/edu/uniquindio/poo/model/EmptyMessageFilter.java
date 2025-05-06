package co.edu.uniquindio.poo.model;

public class EmptyMessageFilter extends NotificationFilter{

    public boolean handle(Notification notification) {
        if (notification.getMessage() == null || notification.getMessage().isEmpty()) {
            System.out.println("Mensaje vacío. Notificación cancelada.");
            return false;
        }
        return super.handle(notification);
    }

}
