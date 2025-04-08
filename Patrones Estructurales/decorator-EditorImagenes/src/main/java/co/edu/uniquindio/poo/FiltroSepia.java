package co.edu.uniquindio.poo;

public class FiltroSepia extends FiltroDecorador {
    public FiltroSepia(Imagen imagen) {
        super(imagen);
    }

    public String mostrar() {
        return this.imagen.mostrar() + " + Filtro Sepia";
    }

    protected String getNombreFiltro() {
        return "Sepia";
    }
}
