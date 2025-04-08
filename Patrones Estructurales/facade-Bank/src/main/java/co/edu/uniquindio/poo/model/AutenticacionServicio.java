package co.edu.uniquindio.poo.model;

// Clase que representa el servicio de autenticación de cuentas
public class AutenticacionServicio {

    // Constructor
    public AutenticacionServicio() {}


    //Metodo para autenticar una cuenta
    public boolean autenticar(String accountId, String providedTitular) {
        System.out.println("Servicio: Autenticando cuenta " + accountId + " para titular " + providedTitular);

        Cuenta cuenta = Bank.getBank().buscarCuenta(accountId);

        if (cuenta != null) {
            boolean autenticado = cuenta.getTitular().equals(providedTitular);
            System.out.println("Servicio: Autenticación " + (autenticado ? "exitosa" : "fallida"));
            return autenticado;
        }
        System.out.println("Servicio: Autenticación fallida - Cuenta no encontrada");
        return false;
    }
}
