package co.edu.uniquindio.poo.model;

//Interface que define el contrato de la fachada del banco
public interface BankFacade {


    // Metodo para realizar una transferencia entre cuentas
    String nuevaTransferencia(Cuenta cuentaOrigen, String idCuentaDestino, String nombreTitularDestino, double valor);

}
