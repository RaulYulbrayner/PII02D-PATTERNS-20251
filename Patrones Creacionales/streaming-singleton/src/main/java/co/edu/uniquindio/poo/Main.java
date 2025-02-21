package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Obtener la configuración y modificarla
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        config.setResolucionVideo("720p");
        config.setAnchoBandaMaximo(5);
        config.setModoAhorroDatos(true);

        // Crear un servidor de streaming
        ServidorStreaming servidor = new ServidorStreaming();
        servidor.ajustarCalidadTransmision();

        // Crear un gestor de sesiones y varias sesiones de reproducción
        GestorSesiones gestor = new GestorSesiones();
        gestor.crearSesion(1);
        gestor.crearSesion(2);
        gestor.crearSesion(3);
    }
}