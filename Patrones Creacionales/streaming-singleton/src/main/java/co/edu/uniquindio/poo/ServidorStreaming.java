package co.edu.uniquindio.poo;

public class ServidorStreaming {

    private ConfiguracionSistema configuracion;

    /**
     * Constructor que obtiene la configuración global del sistema.
     */
    public ServidorStreaming() {
        this.configuracion = ConfiguracionSistema.getInstancia();
    }

    /**
     * Ajusta la calidad de transmisión según la configuración actual.
     */
    public void ajustarCalidadTransmision() {
        System.out.println("Servidor ajustando calidad a: " + configuracion.getResolucionVideo() +
                " con ancho de banda máximo: " + configuracion.getAnchoBandaMaximo() + " Mbps");
    }

}
