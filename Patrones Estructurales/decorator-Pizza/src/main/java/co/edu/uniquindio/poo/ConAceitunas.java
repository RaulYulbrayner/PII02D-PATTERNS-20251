package co.edu.uniquindio.poo;

public class ConAceitunas extends PizzaDecorator{

    /**
     * Constructor de la clase ConAceitunas
     * @param pizza
     */
    public ConAceitunas(Pizza pizza){
        super(pizza);
    }


    /**
     *  Metodo que retorna la descripcion de la pizza si se le agregan aceitunas
     * @return
     */
    @Override
    public String descripcion() {
        return super.descripcion() + " + Aceitunas";
    }

    /**
     * Metodo que retorna el costo de la pizza si se le agregan aceitunas
     * @return
     */
    @Override
    public double costo() {
        return super.costo() + 4000.0;
    }
}
