package co.edu.uniquindio.poo;
import java.time.LocalDateTime;

public class TransaccionProxy implements IAcciones{

    private TransaccionReal transaccionReal;

    private final double LIMITE_DIARIO = 500000;

    private void crearTransaccionSiNoExiste() {
        if (transaccionReal == null) {
            transaccionReal = new TransaccionReal();
            System.out.println("[LOG] Se creó una nueva instancia de TransaccionReal.");
        }
    }

    @Override
    public void Depositar(Cuenta cuenta, double valor) {
        if (!validarCuentaYValor(cuenta, valor)) return;
        if (valor > LIMITE_DIARIO) {
            System.out.println("Error: No puedes depositar más de $" + LIMITE_DIARIO + " por operación.");
            return;
        }

        crearTransaccionSiNoExiste();
        transaccionReal.Depositar(cuenta, valor);
        logOperacion("DEPÓSITO", cuenta, valor);
    }

    @Override
    public void Retirar(Cuenta cuenta, double valor) {
        if (!validarCuentaYValor(cuenta, valor)) return;

        if (valor > LIMITE_DIARIO) {
            System.out.println("Error: No puedes retirar más de $" + LIMITE_DIARIO + " por operación.");
            return;
        }

        if (cuenta.getSaldo() < valor) {
            System.out.println("Error: Saldo insuficiente. Tu saldo actual es $" + cuenta.getSaldo());
            return;
        }

        crearTransaccionSiNoExiste();
        transaccionReal.Retirar(cuenta, valor);
        logOperacion("RETIRO", cuenta, valor);
    }

    @Override
    public void MostrarSaldo(Cuenta cuenta) {
        if (cuenta == null) {
            System.out.println("Error: Cuenta no válida.");
            return;
        }

        crearTransaccionSiNoExiste();
        transaccionReal.MostrarSaldo(cuenta);
        logOperacion("MOSTRAR SALDO", cuenta, 0);
    }

    /**
     *  Metodo para verificar que la cuenta ingresada exista y que el valor a ingresar sea mayor a cero.
     * @param cuenta
     * @param valor
     * @return
     */
    private boolean validarCuentaYValor(Cuenta cuenta, double valor) {
        if (cuenta == null) {
            System.out.println("Error: La cuenta es nula.");
            return false;
        }
        if (valor <= 0) {
            System.out.println("Error: El valor debe ser mayor que 0.");
            return false;
        }
        return true;
    }

    /**
     * Metodo que registra las operaciones realizadas e informacion con un Log para llevar un seguimiento.
     * @param tipo
     * @param cuenta
     * @param valor
     */

    private void logOperacion(String tipo, Cuenta cuenta, double valor) {
        String mensaje = String.format("[LOG] %s | Usuario: %s | Banco: %s | Monto: $%.2f | Saldo Actual: $%.2f |Fecha: %s",
                tipo,
                cuenta.getNombreUsuario(),
                cuenta.getNombreBanco(),
                valor,
                cuenta.getSaldo(),
                LocalDateTime.now());
        System.out.println(mensaje);
    }
}
