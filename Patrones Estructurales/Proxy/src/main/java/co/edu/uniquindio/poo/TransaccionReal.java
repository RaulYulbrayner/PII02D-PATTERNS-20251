package co.edu.uniquindio.poo;

public class TransaccionReal implements IAcciones{

    public void Depositar(Cuenta cuenta, double valor){
        double saldoA = cuenta.getSaldo() + valor;
        cuenta.setSaldo(saldoA);
        System.out.println("Transaccion exitosa y su saldo actual es: " + saldoA);
    }

    public void Retirar(Cuenta cuenta, double valor){
        double saldoA = cuenta.getSaldo() - valor;
        cuenta.setSaldo(saldoA);
        System.out.println("Transaccion exitosa y su saldo actual es: " + saldoA);
    }

    @Override
    public void MostrarSaldo(Cuenta cuenta) {
        System.out.println("Su saldo: " + cuenta.getSaldo());
    }
}
