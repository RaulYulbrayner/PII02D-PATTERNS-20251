package co.edu.uniquindio.poo.model;
//EXTRINSECA
public class Flor {
    //Coordenada x de la flor en el mapa
    private final int x;

    //Coordenada y de la flor en el mapa
    private final int y;

    //Referencia al tipo de flor
    private final TipoFlor tipo;

    /**
     * Constructor de la clase flor
     * @param x posicion en x dentro del mapa
     * @param y posicion en y dentro del mapa
     * @param tipo tipo de flor
     * */
    public Flor(int x, int y, TipoFlor tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    //==========GETTERS Y TOSTRING==========//


    /**
     * Retorna el tipo de flor
     * @return tipo de flor
     * */
    public TipoFlor getTipo() {
        return tipo;
    }

    /**
     * Retorna el simbolo que representa esta flor
     * se obtiene desde el tipo de flor
     * @return simbolo de la flor
     * */
    public String getSimbolo(){
        return  tipo.getSimbolo();
    }

    /**
     * Reperesentacion textual de la flor
     * */
    @Override
    public String toString() {
        return "Flor: " +
                "x=" + x +
                ", y=" + y +
                ", tipo=" + tipo.getSimbolo();
    }
}
