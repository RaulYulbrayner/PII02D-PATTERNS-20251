package co.edu.uniquindio.poo;

public class FiltroBlancoNegro extends FiltroDecorador {
    public FiltroBlancoNegro(Imagen imagen) {
        super(imagen);
    }

    public String mostrar() {
        return this.imagen.mostrar() + " + Filtro Blanco y Negro";
    }

    protected String getNombreFiltro() {
        return "Blanco y Negro";
    }
}
