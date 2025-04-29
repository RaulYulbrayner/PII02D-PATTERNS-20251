package co.edu.uniquindio.poo.model;

/**
 * Decorador abstracto para módulos de seguridad adicionales.
 */
public abstract class ModuloDecorator implements Dispositivo {

    protected Dispositivo decorado;

    public ModuloDecorator(Dispositivo decorado) {
        this.decorado = decorado;
    }

}
