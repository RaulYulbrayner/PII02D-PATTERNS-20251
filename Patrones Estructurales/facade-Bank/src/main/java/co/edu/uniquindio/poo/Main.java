package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Bank;
import co.edu.uniquindio.poo.model.BankFacade;
import co.edu.uniquindio.poo.model.Cuenta;

public class Main {
    public static void main(String[] args) {

        // Crear una instancia de la fachada del banco
        Bank facade = Bank.getBank();

        // Crear cuentas
        Cuenta cuenta1 = new Cuenta("123", "Juan", 20000, "credito");
        Cuenta cuenta2 = new Cuenta("456", "Paulo", 30000, "credito");

        // Añadir cuentas al banco
        facade.añadirCuenta(cuenta1);
        facade.añadirCuenta(cuenta2);

        System.out.println(facade.nuevaTransferencia(cuenta1, "456", "Paulo", 5000));

        //Juan tiene 15k y paulo 35k

        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());

        System.out.println(facade.nuevaTransferencia(cuenta2, "123", "Juan", 20000));

        //Juan tiene 35k y paulo 15k

        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());
    }
}