package co.edu.uniquindio.poo;

public class PagoAdapter implements ProcesadorDePago {
    private SistemaDePagoLegado pagoLegado;

    public PagoAdapter(SistemaDePagoLegado pagoLegado) {
        this.pagoLegado = pagoLegado;
    }

    @Override
    public void pagar(double monto) {
        pagoLegado.realizarPago("USD", monto);
    }
}
