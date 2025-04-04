package co.edu.uniquindio.poo;

public class ConQueso extends PizzaDecorator{

    /**
     * Constructor de la clase ConQueso
     * @param pizza
     */
    public ConQueso(Pizza pizza){
        super(pizza);
    }

    /**
     * Metodo que retorna la descripcion de la pizza si se le agregan quesoExtra
     * @return
     */
    @Override
    public String descripcion() {
        return super.descripcion() + " + Queso Extra ";
    }

    /**
     * Metodo que retorna el costo de la pizza si se le agregan quesoExtra
     * @return
     */
    @Override
    public double costo() {
        return super.costo() + 5000.0;
    }
}
