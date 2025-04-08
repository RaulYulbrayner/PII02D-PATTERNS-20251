package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class ImagenBase implements Imagen {
    public ImagenBase() {
    }

    public String mostrar() {
        return "Imagen original";
    }

    public boolean tieneFiltro(String nombreFiltro) {
        return false;
    }

    public int contarFiltros() {
        return 0;
    }

    public List<String> listarFiltrosAplicados() {
        return new ArrayList();
    }
}
