package co.edu.uniquindio.poo;
//Una aplicación de procesamiento de pagos
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SistemaDePagoLegado sistemaDePagoLegado  = new SistemaDePagoLegado();

        ProcesadorDePago procesarPago = new PagoAdapter(sistemaDePagoLegado);

        procesarPago.pagar(500);

    }
}