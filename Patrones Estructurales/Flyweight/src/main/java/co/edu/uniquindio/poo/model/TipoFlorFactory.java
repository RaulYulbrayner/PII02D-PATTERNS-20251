package co.edu.uniquindio.poo.model;
import java.util.HashMap;

public class TipoFlorFactory {
                                //emoji , objeto
    private static final HashMap<String, TipoFlor> listaTiposFlores = new HashMap<>();

    public static TipoFlor getTipo(String tipo) {

        //Verifica si el tipo de flor ya existe en el mapa 'ListaTipoFLores'
        if (!listaTiposFlores.containsKey(tipo)) {

            //Si no existe, se asigna un simbolo segun el nombre del tipo
            String simbolo = switch (tipo) {
                case "Margarita" -> "🌼";
                case "Tulipan"   -> "🌷";
                case "Rosa"      -> "🌹";
                case "Cerezo"    -> "🌸";
                default          ->  null; //Si no es ninguno de estos, devuelve null
            };

            //Si el tipo ingresado no es valido (no tiene simbolo), se retorna null
            if (simbolo == null) {
                return null;
            }

            //Si es valido, se crea una nueva instancia de TipoFlor
            //y se guarda en el mapa para reutilizarla despues
            listaTiposFlores.put(tipo, new TipoFlor(tipo, simbolo));

        }

        //Restorna el tipo de flor correspondiente desde el mapa
        return listaTiposFlores.get(tipo);
    }

}
