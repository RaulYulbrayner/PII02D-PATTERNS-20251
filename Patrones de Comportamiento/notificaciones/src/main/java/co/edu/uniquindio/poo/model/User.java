package co.edu.uniquindio.poo.model;

public abstract class User {

    protected String email;
    protected boolean blocked;

    public User(String email, boolean blocked) {
        this.email = email;
        this.blocked = blocked;
    }

    public String getEmail() { return email; }
    public boolean isBlocked() { return blocked; }

    // Método plantilla
    public final String formatMessage(String rawMessage) {
        return getHeader() + "\n" + personalizeMessage(rawMessage) + "\n" + getFooter();
    }

    protected abstract String getHeader();
    protected abstract String personalizeMessage(String message);
    protected abstract String getFooter();


}
