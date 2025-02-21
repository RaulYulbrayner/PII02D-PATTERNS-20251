package co.edu.uniquindio.poo;

public class SesionReproduccion {

    private ConfiguracionSistema configuracion;
    private int idSesion;

    /**
     * Constructor que asigna un ID a la sesión y obtiene la configuración global.
     * @param idSesion el identificador único de la sesión.
     */
    public SesionReproduccion(int idSesion) {
        this.configuracion = ConfiguracionSistema.getInstancia();
        this.idSesion = idSesion;
    }

    /**
     * Inicia la sesión de reproducción con la configuración global actual.
     */
    public void iniciarSesion() {
        System.out.println("Sesión " + idSesion + " iniciando con calidad: " + configuracion.getResolucionVideo() +
                " y ancho de banda máximo: " + configuracion.getAnchoBandaMaximo() + " Mbps");
    }

}
