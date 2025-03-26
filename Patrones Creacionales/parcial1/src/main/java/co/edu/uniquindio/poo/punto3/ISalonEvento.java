package co.edu.uniquindio.poo.punto3;

public interface ISalonEvento {

    public void crearSalonEvento(String nombre, int capacidad, boolean tieneProyector, int IdSalon);
    public void eliminarSalonEvento(int idSalon);

}
