package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class MiniMapa {
    //Dimensiones del mapa
    private final int ancho;
    private final int alto;

    //Matriz que representa el area del mapa
    private final String[][] area;

    //Lista de flores que han sido plantadas en el mapa
    private final List<Flor> flores = new ArrayList<>();

    /**
     * Constructor del MiniMapa
     * Inicializa el mapa con las dimensiones dadas y llena el area con el simbolo de pasto
     * @param ancho numero de columnas del mapa
     * @param alto numero de filas del mapa
     * */
    public MiniMapa(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.area = new String[ancho][alto];

        //Llena todo el mapa inicialmente con el simbolo de pasto
        for (int y= 0; y < ancho; y++) {
            for (int x = 0; x < alto; x++) {
                area[y][x] = "\uD83C\uDF31";
            }
        }
    }

    /**
     * Planta una flor en la posicion del mapa, utilizando el tipo especificado
     * Se usa el patron flight weight con el TipoFLorFactory para reutilizar tipos de flor
     * @param posicionFlorEnX columna (x) donde se planta la flor
     * @param posicionFlorEnY fila (y) donde se planta la flor
     * @param tipoNombre nombre del tipo de flor
     * */
    public void plantarFlor(int posicionFlorEnX, int posicionFlorEnY, String tipoNombre) {
        //Obtener el tipo de flor desde el factory
        TipoFlor tipo = TipoFlorFactory.getTipo(tipoNombre);

        //Crea la nueva flor con sus coordenadas y tipo
        Flor flor = new Flor(posicionFlorEnX, posicionFlorEnY, tipo);

        //Agrega la flor en la lista de flores del mapa
        flores.add(flor);

        //Coloca la flor en la matriz
        area[posicionFlorEnY][posicionFlorEnX] = flor.getSimbolo();
        //se pinta la flor en esa posicion
    }

    /**
     * Muestra el mapa completo en la consola con los simbolos de pasto o flores
     * */
    public void mostrarMapa(){
        for (int y = 0; y < ancho; y++) {
            for (int x = 0; x < alto; x++) {
                System.out.print(area[y][x]+ " ");
            }
            System.out.println();
        }
    }

    /**
     * Getter para obtener la lista de flores plantadas
     * @return lista de flores
     * */
    public List<Flor> getFlores() {
        return flores;
    }
}
