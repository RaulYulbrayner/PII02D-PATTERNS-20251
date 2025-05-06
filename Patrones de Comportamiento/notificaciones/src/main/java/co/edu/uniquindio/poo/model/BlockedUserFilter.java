package co.edu.uniquindio.poo.model;

public class BlockedUserFilter extends NotificationFilter {

    public boolean handle(Notification notification) {
        if (notification.getUser().isBlocked()) {
            System.out.println("Usuario bloqueado. Notificación cancelada.");
            return false;
        }
        return super.handle(notification);
    }

}
