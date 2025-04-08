package co.edu.uniquindio.poo.model;

// Clase que representa el servicio de transferencia
public class GenerarTransferenciaServicio {

    // Constructor
    public GenerarTransferenciaServicio() {}

    // Metodo para ejecutar una transferencia entre cuentas
    public boolean ejecutarTransferencia(Cuenta origen, Cuenta destino, double monto) {
        System.out.println("Servicio: Ejecutando transferencia de " + monto + " desde " + origen.getId() + " hacia " + destino.getId());
        if (origen == null || destino == null || monto <= 0) {
            System.out.println("Servicio: Transferencia fallida - Datos inválidos");
            return false;
        }
        //Validaciones
        try {
            origen.setSaldo(origen.getSaldo() - monto);
            destino.setSaldo(destino.getSaldo() + monto);
            System.out.println("Servicio: Transferencia completada exitosamente");
            return true;
        } catch (Exception e) {

            System.err.println("Servicio: Error durante la transferencia - " + e.getMessage());

            return false;
        }
    }
}
