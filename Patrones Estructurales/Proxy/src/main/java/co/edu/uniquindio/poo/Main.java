package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Maria", "Bancolombia", "C1",10000);
        Cuenta cuenta2 = new Cuenta("Dario", "BBVA", "C2",20000);

        IAcciones transaccion = new TransaccionProxy();
        transaccion.Depositar(cuenta1,100);
        transaccion.Retirar(cuenta1,10000);
        transaccion.Retirar(cuenta2,4550);
        transaccion.MostrarSaldo(cuenta2);
    }
}