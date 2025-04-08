package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroDecorador implements Imagen {
    protected final Imagen imagen;

    protected FiltroDecorador(Imagen imagen) {
        this.imagen = imagen;
    }

    public abstract String mostrar();

    protected abstract String getNombreFiltro();

    public boolean tieneFiltro(String nombreFiltro) {
        return this.getNombreFiltro().equalsIgnoreCase(nombreFiltro) || this.imagen.tieneFiltro(nombreFiltro);
    }

    public int contarFiltros() {
        return 1 + this.imagen.contarFiltros();
    }

    public List<String> listarFiltrosAplicados() {
        List<String> filtros = new ArrayList(this.imagen.listarFiltrosAplicados());
        filtros.add(this.getNombreFiltro());
        return filtros;
    }
}
