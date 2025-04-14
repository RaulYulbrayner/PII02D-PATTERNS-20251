package co.edu.uniquindio.poo;

public interface IAcciones {
    public void Depositar(Cuenta cuenta, double valor);
    public void Retirar(Cuenta cuenta, double valor);
    public void MostrarSaldo(Cuenta cuenta);
}
