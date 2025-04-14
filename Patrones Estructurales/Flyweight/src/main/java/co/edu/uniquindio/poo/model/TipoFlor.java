package co.edu.uniquindio.poo.model;
//INTRINSECA = NO ES MODIFICABLE, SOLO SE CREA UNA VEZ
public class TipoFlor {

    //Nombre del tipo flor (ej: "Rosa", "Tulipan", etc)
    private final String nombre;

    //Simbolo con el que se representa la esta flor en el mapa
    private final String simbolo;

    /**
     * Constructor TipoFlor
     * @param nombre nombre del tipo de flor
     * @param simbolo emoji o simbolo que representa visualmente el tipo de flor
     * */
    public TipoFlor(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    /**
     * Retorna el simbolo del tipo de flor.
     * Este simbolo se usara para mostrar la flor en la mapa
     * */
    public String getSimbolo() {
        return simbolo;
    }
}
