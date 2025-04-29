package co.edu.uniquindio.poo.model;

/**
 * Módulo decorador que añade funcionalidad de firewall.
 */
public class Firewall extends ModuloDecorator {

    public Firewall(Dispositivo decorado) {
        super(decorado);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String estado() {
        return decorado.estado() + " + Módulo: Firewall";
    }

    @Override
    public int prioridad() {
        return decorado.prioridad() + 2;
    }

    @Override
    public String tipo() {
        return decorado.tipo();
    }
    
}
