package co.edu.uniquindio.poo;

public class AjusteBrillo extends FiltroDecorador {
    public AjusteBrillo(Imagen imagen) {
        super(imagen);
    }

    public String mostrar() {
        return this.imagen.mostrar() + " + Ajuste de Brillo";
    }

    protected String getNombreFiltro() {
        return "Ajuste de Brillo";
    }
}
