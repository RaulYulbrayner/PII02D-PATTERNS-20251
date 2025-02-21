package co.edu.uniquindio.poo;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;
    private String resolucionVideo;
    private int anchoBandaMaximo;
    private boolean modoAhorroDatos;

    /**
     * Constructor privado para evitar la instanciación directa.
     * Inicializa los valores predeterminados de la configuración.
     */
    private ConfiguracionSistema() {
        // Valores predeterminados
        this.resolucionVideo = "1080p";
        this.anchoBandaMaximo = 10;
        this.modoAhorroDatos = false;
    }

    /**
     * Obtiene la única instancia de ConfiguracionSistema.
     * @return la instancia única de ConfiguracionSistema.
     */
    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public static void setInstancia(ConfiguracionSistema instancia) {
        ConfiguracionSistema.instancia = instancia;
    }

    public boolean isModoAhorroDatos() {
        return modoAhorroDatos;
    }

    public void setModoAhorroDatos(boolean modoAhorroDatos) {
        this.modoAhorroDatos = modoAhorroDatos;
    }

    public int getAnchoBandaMaximo() {
        return anchoBandaMaximo;
    }

    public void setAnchoBandaMaximo(int anchoBandaMaximo) {
        this.anchoBandaMaximo = anchoBandaMaximo;
    }

    public String getResolucionVideo() {
        return resolucionVideo;
    }

    public void setResolucionVideo(String resolucionVideo) {
        this.resolucionVideo = resolucionVideo;
    }

    @Override
    public String toString() {
        return "ConfiguracionSistema{" +
                "resolucionVideo='" + resolucionVideo + '\'' +
                ", anchoBandaMaximo=" + anchoBandaMaximo +
                ", modoAhorroDatos=" + modoAhorroDatos +
                '}';
    }
}
