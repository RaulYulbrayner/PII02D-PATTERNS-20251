package co.edu.uniquindio.poo;

public class AjusteContraste extends FiltroDecorador {
    public AjusteContraste(Imagen imagen) {
        super(imagen);
    }

    public String mostrar() {
        return this.imagen.mostrar() + " + Ajuste de Contraste";
    }

    protected String getNombreFiltro() {
        return "Ajuste de Contraste";
    }
}
