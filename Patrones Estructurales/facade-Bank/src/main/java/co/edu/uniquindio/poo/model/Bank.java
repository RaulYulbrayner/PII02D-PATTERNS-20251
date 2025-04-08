package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Bank implements BankFacade {
    // Atributos
    private final AutenticacionServicio authService;
    private final ConfirmarSaldoServicio balanceService;
    private final GenerarTransferenciaServicio transferService;
    static Bank banco;
    private String nombre;
    private LinkedList<Cuenta> listaCuentas;


    //Metodo para realizar una transferencia

    @Override
    public String nuevaTransferencia(Cuenta cuentaOrigen, String idCuentaDestino, String nombreTitularDestino, double valor) {
        String mensaje = "";

        if (cuentaOrigen == null) {
            return "Error: La cuenta de origen no puede ser nula.";
        }
        if (valor <= 0) {
            return "Error: El valor de la transferencia debe ser positivo.";
        }
        Cuenta cuentaDestino = buscarCuenta(idCuentaDestino);
        if (cuentaDestino == null) {
            return "Error: La cuenta de destino con ID " + idCuentaDestino + " no existe.";
        }
        if (cuentaOrigen.getId().equals(cuentaDestino.getId())) {
            return "Error: No se puede transferir a la misma cuenta.";
        }


        // Autenticar/Validar Cuenta Destino (Usando la instancia del servicio)
        boolean autenticacionDestinoOk = this.authService.autenticar(idCuentaDestino, nombreTitularDestino);
        if (!autenticacionDestinoOk) {
            mensaje = "Validación fallida: El titular proporcionado no coincide con la cuenta destino.";
            System.out.println("--- FACADE: Transferencia fallida \n(" + mensaje + ") ---");
            return mensaje;
        }
        // Confirmar Saldo en Origen (Usando la instancia del servicio)
        boolean saldoOk = this.balanceService.tieneSaldoSuficiente(cuentaOrigen, valor);
        if (!saldoOk) {
            mensaje = "Saldo insuficiente en la cuenta origen.";
            System.out.println("--- FACADE: Transferencia fallida (" + mensaje + ") ---");
            return mensaje;
        }

        //Ejecutar Transferencia (Usando la instancia del servicio)
        boolean transferenciaOk = this.transferService.ejecutarTransferencia(cuentaOrigen, cuentaDestino, valor);

        if (transferenciaOk) {
            mensaje = "Transferencia realizada exitosamente por valor de " + valor + " a la cuenta " + idCuentaDestino;
            System.out.println("--- FACADE: Transferencia completada exitosamente ---");
            return mensaje;
        } else {

            //Error en la transferencia
            mensaje = "Error: No se pudo completar la transferencia.";
            System.out.println("--- FACADE: Transferencia fallida (Error en ejecución del servicio) ---");
            return mensaje;
        }
    }


    //metodo para buscar una cuenta por ID
    public Cuenta buscarCuenta(String idCuenta) {
        Cuenta cuentaEncontrada = null;
        for (Cuenta c : listaCuentas) {
            if (c.getId().equals(idCuenta)) {
                cuentaEncontrada = c;
                break;
            }
        }
        return cuentaEncontrada;
    }

    //Metodo para añadir una cuenta a la lista de cuentas
    public void añadirCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
    }

    //Metodo para eliminar una cuenta de la lista de cuentas
    public void borrarCuenta(Cuenta cuenta) {
        listaCuentas.remove(cuenta);
    }


    //Implementacion Singleton
    private Bank(AutenticacionServicio authService, ConfirmarSaldoServicio balanceService, GenerarTransferenciaServicio transferService, String nombre) {
        this.authService = authService;
        this.balanceService = balanceService;
        this.transferService = transferService;
        this.nombre = nombre;
        this.listaCuentas = new LinkedList<>();
    }

    // Metodo para obtener la instancia única de Bank (Singleton)
    public static Bank getBank() {
        if (banco == null){
            banco = new Bank(new AutenticacionServicio(),new ConfirmarSaldoServicio(),new GenerarTransferenciaServicio(), "BancoFacade");
        }
        return banco;
    }

    // Getters y Setters
    public static Bank getBanco() {
        return banco;
    }

    public static void setBanco(Bank banco) {
        Bank.banco = banco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(LinkedList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
}
