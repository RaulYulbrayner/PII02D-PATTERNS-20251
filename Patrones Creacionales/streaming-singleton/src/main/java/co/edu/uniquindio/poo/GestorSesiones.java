package co.edu.uniquindio.poo;

public class GestorSesiones {

    /**
     * Crea una nueva sesión de reproducción con el ID especificado.
     * @param idSesion el identificador único de la sesión.
     */
    public void crearSesion(int idSesion) {
        SesionReproduccion sesion = new SesionReproduccion(idSesion);
        sesion.iniciarSesion();
    }

}
