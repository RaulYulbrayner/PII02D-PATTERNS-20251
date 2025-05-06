package co.edu.uniquindio.poo.model;

public class NotificationFilter {

    protected NotificationFilter next;

    public void setNext(NotificationFilter next) {
        this.next = next;
    }

    public boolean handle(Notification notification) {
        if (next != null) return next.handle(notification);
        return true;
    }

}
