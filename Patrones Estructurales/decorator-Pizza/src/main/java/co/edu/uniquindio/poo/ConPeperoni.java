package co.edu.uniquindio.poo;

public class ConPeperoni extends PizzaDecorator{

    /**
     * Constructor de la clase ConPeperoni
     * @param pizza
     */
    public ConPeperoni(Pizza pizza) {
        super(pizza);
    }

    /**
     * Metodo que retorna la descripcion de la pizza si se le agregan peperoni
     * @return
     */
    @Override
    public String descripcion(){
        return super.descripcion() + " + peperoni";
    }

    /**
     * Metodo que retorna el costo de la pizza si se le agregan peperoni
     * @return
     */
    @Override
    public double costo(){
        return super.costo() + 2500.0;
    }
}
