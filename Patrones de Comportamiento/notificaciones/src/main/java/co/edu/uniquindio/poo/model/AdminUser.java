package co.edu.uniquindio.poo.model;

public class AdminUser extends User {

    public AdminUser(String email, boolean blocked) {
        super(email, blocked);
    }

    protected String getHeader() { return "[ADMINISTRADOR]"; }
    protected String personalizeMessage(String message) { return "Administrador: " + message; }
    protected String getFooter() { return "-- Sistema --"; }

}
