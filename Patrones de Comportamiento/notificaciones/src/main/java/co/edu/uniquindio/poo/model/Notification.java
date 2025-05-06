package co.edu.uniquindio.poo.model;

public class Notification {

    private User user;
    private String message;
    private NotificationStrategy strategy;

    public Notification(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void send() {
        String formatted = user.formatMessage(message);
        strategy.send(user, formatted);
    }

}
