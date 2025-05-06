package co.edu.uniquindio.poo.model;

public class SendNotificationCommand implements NotificationCommand {

    private Notification notification;

    public SendNotificationCommand(Notification notification) {
        this.notification = notification;
    }

    public void execute() {
        notification.send();
    }

}
