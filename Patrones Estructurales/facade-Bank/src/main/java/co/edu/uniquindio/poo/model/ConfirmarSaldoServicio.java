package co.edu.uniquindio.poo.model;

// Clase que representa el servicio de confirmación de saldo
public class ConfirmarSaldoServicio {

    // Constructor
    public ConfirmarSaldoServicio() {}

    // Metodo para verificar si una cuenta tiene saldo suficiente
    public boolean tieneSaldoSuficiente(Cuenta cuenta, double monto) {
        System.out.println("Servicio: Verificando saldo de cuenta " + cuenta.getId() + " para monto " + monto);
        if (cuenta != null) {
            boolean suficiente = cuenta.getSaldo() >= monto;
            System.out.println("Servicio: Saldo " + (suficiente ? "suficiente" : "insuficiente"));
            return suficiente;
        }
        System.out.println("Servicio: Verificación de saldo fallida - Cuenta es null");
        return false;
    }

}
