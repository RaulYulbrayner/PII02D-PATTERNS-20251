package co.edu.uniquindio.poo;

import java.util.List;

public interface Imagen {
    String mostrar();

    boolean tieneFiltro(String var1);

    int contarFiltros();

    List<String> listarFiltrosAplicados();
}
